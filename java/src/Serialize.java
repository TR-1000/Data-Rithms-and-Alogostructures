
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable {

	private String productName;

	private transient String productId;

	public String brandName;

	public static int brandId = 10001;

	public Product(String productName, String productId) {

		this.productName = productName;

		this.productId = productId;

		brandName = "Infy";

		brandId++;

	}

	@Override

	public String toString() {

		return "Account [productName =" + productName + ", productId =" + productId + ", brandName=" + brandName
				+ ", brandId= "

				+ brandId + "]";

	}

}

public class Serialize {

	public static void main(String[] args) throws Exception {

		Product product = new Product("Laptop", "20345678");

		ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("product.dat"));

		objOutStream.writeObject(product);

		Product product2 = new Product("Laptop", "20345678");

		ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream("product.dat"));

		Product prodRead = (Product) objInStream.readObject();

		System.out.println(prodRead);

		objOutStream.close();

		objInStream.close();

	}

}