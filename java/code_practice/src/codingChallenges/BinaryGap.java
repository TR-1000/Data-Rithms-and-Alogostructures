package codingChallenges;

/*Find longest sequence of zeros in binary representation of an integer*/
public class BinaryGap {
	public static int solution(int N) {
		int longest=0;
		int zeros=0;
		String binaryRep = Integer.toBinaryString(N);
		for (int i = 0; i < binaryRep.length(); i++) {
			if(binaryRep.charAt(i)=='0') {
				zeros+=1;
			} else {
				if(zeros > longest) {
					longest = zeros;
					zeros = 0;
				} else {
					zeros = 0;
				}
			}
		}
		
		return longest;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(1041));
	}
		
		
		

	
	
}
