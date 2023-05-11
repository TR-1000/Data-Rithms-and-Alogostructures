package recursion;

public class Fibonacci {

	public static int iterative(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		int current = 1;
		int previous = 0;
		
		for(int i=n-1; i>0; i--) {
			int sum= previous + current;
			previous = current;
			current = sum;
		}
		return current;
	}
	
	public static int recursive(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return recursive(n-1) + recursive(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(iterative(6));
		System.out.println(recursive(6));
	}
}
