package codingchallenges;

public class MaximizingXor {
	
	static int solution(int l, int r) {
		return (1 << Integer.toBinaryString(l ^ r).length()) - 1;
	}
	
}

/*
 * https://www.hackerrank.com/challenges/maximizing-xor/problem
 * Given two integers, l and r, find the maximal value of a xor b,
 * where a and b satisfy the following condition: l <= a <= b <= r
 */
