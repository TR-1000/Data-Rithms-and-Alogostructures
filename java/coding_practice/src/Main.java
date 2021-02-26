import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static int fib(int n) {
		if(n==0)
			return 0;
		
		if(n==1)
			return 1;
		
		return fib(n-1) + fib(n-2);
	}
	
	public static int factorial(int n) {
		int f = 1;
		
		for(int i=n; i>0; i--) {
			f*=i;
			System.out.println(f);
		}
		return f;
	}
	
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
		
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
				date.plusDays(2);
				date.plusHours(3);
				System.out.println(date.getYear() + " " + date.getMonth() + " "
				+ date.getDayOfMonth());
	
	}
}


