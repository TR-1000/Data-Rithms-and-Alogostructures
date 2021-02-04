package datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	
	public static void print() {
		System.out.println("printing");
		
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("test1","test2","test3");
		System.out.println(list);
//		list.add("test4"); // runtime error
		list.set(list.size()-1, "element");
		System.out.println(list);
		
		List<Integer> numbers = Arrays.asList(1,71,5,8,16,15);
		System.out.println(Collections.binarySearch(numbers, 72));
		
	}
	
	private String name;
	
}
