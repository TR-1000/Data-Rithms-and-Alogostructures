package codingchallenges;

public class CamelCase  {
	
	static int solution(String s) {
		
		int count = 1;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c))
				count++;
		}
		System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) {
		String s = "saveChangesInTheEditor";
		solution(s);
	}
}

/*
HackerRank
A sequence of words in CamelCase as a string of letters, s , having the following properties:
It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , print the number of words in on a new line.
*/