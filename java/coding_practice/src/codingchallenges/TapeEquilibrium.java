package codingchallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {
	public static int solution(int[] A) {
		// very slow function
		
		if(A.length<2)
            return 1;
		
		int minDiff = 1;
		int P = 1; //split position
		int firstSum = 0;
		int secondSum = 0;
		List<Integer> intList = new ArrayList<>();
		
		while(P < A.length) {
			
			for (int i = 0; i < A.length; i++) {
				if (i < P) {
					firstSum += A[i];
				} else {
					secondSum += A[i];
				}
			}
			
			System.out.println("first sum: "+firstSum);
			System.out.println("second sum: "+secondSum);
			P++;
			intList.add(Math.abs(firstSum-secondSum));
			firstSum=0;
			secondSum=0;
		}
		
		minDiff = Collections.min(intList);
		
		return minDiff;
	}
	public static void main(String[] args) {
		
		int[] A = {1,0,1,8,10,11};
		System.out.println(solution(A));
		
	}
}
