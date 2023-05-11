import java.util.Arrays;
import java.util.List;

public class Reducer {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers //
		  .stream()
		  .reduce(0, (subtotal, element) -> subtotal / element);
		System.out.println(result);
	
		
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		String results = letters
		  .stream()
		  .reduce("", (partialString, element) -> partialString + element);
		System.out.println(results);
		
	}
}
