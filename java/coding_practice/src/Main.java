import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	
	public static void main(String[] args) {
		String str = "Hello World";
		String strRev = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			strRev += str.charAt(i);
		}
		System.out.println(strRev);
	}
}


