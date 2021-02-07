import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	static int counter = 0;
	
	public static String inception() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
//		
//		return "done";
		
		
		
		System.out.println(counter);
		
		if (counter > 3) {
			return "done";
		}
		
		counter++;
		return inception();
	}
	
	
	public static void main(String[] args) {
		System.out.println(inception());
	}
}


