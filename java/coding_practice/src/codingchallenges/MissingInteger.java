package codingchallenges;

import java.util.Arrays;

public class MissingInteger {
	public static int solution(int[] A) {
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		int smallest=0;
		int greatest=A[A.length-1];
		for (int i = 0; i < A.length; i++) {
			
			if(A[i]<1) {
				if(i==A.length-1) {
					
					System.out.println("last");
					return 1;
				}
				System.out.println("less than 1 - skip");
				continue;
			} else {
				smallest = A[i];
				break;
			}
		}
		
		if(smallest > 1) {
			System.out.println("returned 1");
			return 1;
		} else {
			int current = smallest;
			while(current <= greatest)
			
			if(Arrays.binarySearch(A, current+1) < 0) {
				System.out.println("returned "+ (current + 1));
				return current + 1;
			} else {
				current++;
			}
		}
		
		System.out.println(A[A.length]-1);
		return A[A.length];
		
	}
	
	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
		solution(A);
		
		
	}
}

/*

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.
 
*/


