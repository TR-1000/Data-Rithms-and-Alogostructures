package codingchallenges;

import java.util.Arrays;

public class PermMissingElem {
	public static int solution(int[] A) {
		if (A.length==0) {
			return 1;
		}
		
		Arrays.sort(A);
		
		int s = 1; // start at int 1
		int i = 0; // starting index
		
		if(A[i]!= 1) {
			// if first int in array isn't 1 then return 1
			return 1;
		} else {
			// start searching for consecutive ints
			while(i < A.length) {
				s++;
				if(Arrays.binarySearch(A, s) < 0) {
					return s;
				}
			}
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		int[] A = {};
		System.out.println(solution(A));
	}
}
