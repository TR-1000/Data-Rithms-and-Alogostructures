package codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {
	public static int solution(int[] A) {
		int minDiff = 0;
		int leftSum = 0; //first sub array after split
		int sum = Arrays.stream(A).sum();
		//System.out.println("sum " + sum);
		List<Integer> intList = new ArrayList<>();
		
		for (int i = 0; i < A.length-1; i++) {
			leftSum += A[i];
			int rightSum = sum - leftSum;
			intList.add(Math.abs(leftSum - rightSum));
			
		}
		
		minDiff = Collections.min(intList);
		System.out.print("differences ");
		System.out.println(intList);
		
		return minDiff;
		
		
//		// very slow function: 53% score
//		if(A.length<2)
//            return 1;
//		
//		int minDiff = 1;
//		int P = 1; //split position
//		int firstSum = 0;
//		int secondSum = 0;
//		List<Integer> intList = new ArrayList<>();
//		
//		while(P < A.length) {
//			
//			for (int i = 0; i < A.length; i++) {
//				if (i < P) {
//					firstSum += A[i];
//				} else {
//					secondSum += A[i];
//				}
//			}
//			
//			System.out.println("first sum: "+firstSum);
//			System.out.println("second sum: "+secondSum);
//			P++;
//			intList.add(Math.abs(firstSum-secondSum));
//			firstSum=0;
//			secondSum=0;
//		}	
//		minDiff = Collections.min(intList);
//		
//		System.out.println(intList);
//		
//		return minDiff;
	}
	public static void main(String[] args) {
		
		int[] A = {3,1,2,4,3};
		System.out.println(solution(A));
		
	}
}
