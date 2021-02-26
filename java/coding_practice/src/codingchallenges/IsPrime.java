package codingchallenges;

public class IsPrime {
	
	public static boolean isPrime(int n) {
		
		//loop from 2 to n/2 because a number is not divisible by more than its half.
		for(int i = 2; i <= n/2; i++) {
			 //check if the n is divisible by any number in the given range 2 to n/2
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(7));
		System.out.println(isPrime(9));
	}
}
