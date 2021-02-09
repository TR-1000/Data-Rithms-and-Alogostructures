package strings;

public class ReverseString {
	
	static String reverse (String str) {
		String reversed = "";
		int current = str.length() - 1;
		
		while(current >= 0) {
			reversed += str.charAt(current);
			current--;
		}
		
		return reversed;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("popcorn"));
	}
}
