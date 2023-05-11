package recursion;

public class SimpleCounter {
	static int counter = 0;

	public static String inceptionRecursive() {
		/*recursive*/
		
		// 2 returns for the base case and recursive case
		System.out.println("recursing... " + counter);
		// base case
		if (counter > 3) {
			return "done recursively";
		}
		counter++;
		// recursive case
		return inceptionRecursive();
	}
	
	public static String inceptionIterative() {
		/*iterative*/ 
		for (int i = 0; i <= 4; i++) {
			System.out.println("iterating... " + i);
		}
		
		return "done iteratively";

	}

	public static void main(String[] args) {
		System.out.println(inceptionIterative());
		System.out.println(inceptionRecursive());
	}
}
