package recursion;

public class ReverseString {
	
	public static String recursive (String str) {
		if(str.isEmpty())
			return str;
		
		return str.substring(str.length()-1) + recursive(str.substring(0, str.length() - 1));
	}
	
	
	public static String iterate(String str) {
		int start = 0;
		while(start < str.length()) {
			str = str.substring(0, start) +
				str.substring(str.length() - 1) +
				str.substring(start, str.length() - 1);
			start++;
		}
		return str;
	}

	public static void main(String[] args) {
		String str = "12345";
		
		System.out.println(recursive(str));

	}

}
