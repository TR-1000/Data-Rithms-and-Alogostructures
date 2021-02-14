package strings;

public class CountVowelsConsonants {

	public static void getNumber(String str) {
		str = str.toLowerCase().trim();
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String vowels = "aeiou";
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			String character = String.valueOf(str.charAt(i));
			if(alphabet.contains(character)) {
				if(vowels.contains(character)) {
					vowelCount++;
					System.out.println(character+" vowel");
				} else {
					consonantCount++;
					System.out.println(character+" consonant");
				}
			} else {
				System.out.println(character);
			}
		}
		
		System.out.println("vowels: "+vowelCount);
		System.out.println("consonants: "+consonantCount);
	}
	
	public static void main(String[] args) {
		getNumber("Hello World");
	}
}

/*
 * Create a method that takes a string and 
 * prints out the number of vowels and 
 * the number of consonants
 * 
 */
