package recursion;

public class Factorial {
	
	public static int iterative(int n) {
		int p = 1;
		for (int i=n; i>=1; i--) {
			System.out.println("iterating... " + i);
			p*=i;
		}
		return p;
	}
	
	public static int iterativeWhile(int n) {		
		int total=1;
		while(n>=1) {
			total *= n;
			n--;
		}
		
		return total;
	}
	
	public static int recursive(int n) {
		System.out.println("recursing... " + n);
		if (n<=1) {
			return 1;
		}
		
		return recursive(n-1) * n;
	}

	public static void main(String[] args) {
		System.out.println(iterative(5));
		System.out.println(recursive(5));
		System.out.println(iterativeWhile(6));
	}
	
}

/*
 
Factorial

5! = 5 * 4 * 3 * 2 * 1 = 120

5! = 5 * 4!
5! = 5 * 4 * 3!
5! = 5 * 4 * 3 * 2!
5! = 5 * 4 * 3 * 2 * 1!

*/
