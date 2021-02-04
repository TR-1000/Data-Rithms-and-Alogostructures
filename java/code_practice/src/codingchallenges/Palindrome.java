package codingChallenges;

public class Palindrome {
	
	static boolean isPalindrome(String word) {
		
		word = word.toUpperCase();
		
		//starting position
		int index = 0;
		
		//ending position
		int end = word.length();
		
		while(index != 2) {
			if(word.charAt(index) != word.charAt(end - 1)) {
				return false;
			} else {
				index++;
				end--;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("Kayak"));
	}
}
