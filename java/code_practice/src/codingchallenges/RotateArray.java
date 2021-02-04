package codingchallenges;

import java.util.Arrays;

public class RotateArray {
	public static int[] solution(int[] A, int K) {
		
		while(K > 0) {
			
			int[] rotated = new int[A.length];
			rotated[0]=A[A.length-1];
			
			for (int i = 0; i < A.length-1; i++) {
				rotated[i+1]= A[i];
			}
		
			A = rotated;
			K--;
		}
		
		System.out.println(Arrays.toString(A));
		return A;
	}
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4};
		solution(intArray, 4);
		
	}
}

/* An array A consisting of N integers is given. 
 * Rotation of the array means that each element is shifted right by one index, 
 * and the last element of the array is moved to the first place. 
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] 
 * (elements are shifted right by one index and 6 is moved to the first place).
 * The goal is to rotate array A K times; 
 * that is, each element of A will be shifted to the right K times.
 * */