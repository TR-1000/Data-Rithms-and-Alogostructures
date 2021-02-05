package codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrogRiverOne {
	public static int solution(int X, int[] A) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			// if list contains current int skip it, ele add it.
			if (list.contains(A[i])) {
				continue;
			} else {
				//after adding int to list, sort the list
				// if X is in the position of X-1 all spots before X have been filled
				list.add(A[i]);
				Collections.sort(list);
				System.out.println(list);
				if (list.contains(X)) {
					if (list.get(X - 1) == X)
						return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		System.out.println(solution(5, A));
	}
}

/*
 * Write a function: class Solution { public int solution(int X, int[] A); }
 * that, given a non-empty array A consisting of N integers and integer X,
 * returns the earliest time when the frog can jump to the other side of the
 * river. If the frog is never able to jump to the other side of the river, the
 * function should return −1.
 * 
 * For example, given X = 5 and array A such that:
 * 
 * A[0] = 1 A[1] = 3 A[2] = 1 A[3] = 4 A[4] = 2 A[5] = 3 A[6] = 5 A[7] = 4
 * 
 * the function should return 6, as explained above. Write an efficient
 * algorithm for the following assumptions: N and X are integers within the
 * range [1..100,000]; each element of array A is an integer within the range
 * [1..X].
 */
