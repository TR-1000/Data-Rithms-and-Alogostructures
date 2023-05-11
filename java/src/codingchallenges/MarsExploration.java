package codingchallenges;

public class MarsExploration {
	static int solution(String s) {
		String sos = "";
		int count = 0;
		
		// divide s by 3 to get the number of SOS messages and get original message
		
		for (int i = 0; i < s.length()/3; i++) {
			sos+="SOS";
		}
		System.out.println("SOS message should read: "+ sos);
		
		// loop over intended message and determine the number of changes
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != sos.charAt(i)) {
				count+=1;
			}
		}
		
		System.out.println("Number of changes: " + count);
		return count;
	}
	
	public static void main(String[] args) {
		String s = "SSSSPSSQSSOR";
		solution(s); // 4
	}
}

/*Letters in some of the SOS messages are altered by cosmic radiation during transmission. 
 *Given the signal received by Earth as a string, s, determine how many letters of the SOS message have been changed by radiation.
 *Sample input: SOSSPSSQSSOR
 *Sample Output: 3
 * */
