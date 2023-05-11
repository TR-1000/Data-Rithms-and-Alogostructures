
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	private String accountName;
	private transient String accountNo;
	public String bankName;

	public Account(String accountName, String accountNo) {
		this.accountName = accountName;
		this.accountNo = accountNo;
		bankName = "BankofTexas";
	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountNo=" + accountNo + ", bankName=" + bankName + "]";
	}
}

public class FileStream {
	public static void main(String[] args) throws Exception {
		Account account = new Account("Finance Texas", "20345678");
		System.out.println(account);

		ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("account.dat"));

		objOutStream.writeObject(account);
		ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream("account.dat"));
		Account accountRead = (Account) objInStream.readObject();
		System.out.println(accountRead);
		System.out.println(account);
		objOutStream.close();
		objInStream.close();
	}
}
