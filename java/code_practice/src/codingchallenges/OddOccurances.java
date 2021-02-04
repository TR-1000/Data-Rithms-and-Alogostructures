package codingChallenges;

import java.util.HashMap;
import java.util.Map;

public class OddOccurances {
	public static int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : A) {
			if(map.containsKey(i)) {
				map.replace(i, (map.get(i))+1);
			} else {
				map.put(i, 1);
			}
		}
		
		for (int i : A) {
			if(map.get(i) == 1) {
				return i;
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		System.out.println(solution(A));
		
		
	}
}
