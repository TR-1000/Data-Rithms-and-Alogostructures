package compare_sort;

import java.util.*;
import java.util.Map.Entry;

public class ParalledArrays {
	
	
	static String sortHeights(String names, String heights) {
		String[] nArray = names.split(",");
		String[] hArray = heights.split(",");
		String orderedNames="";
		
		Map<Float,String> map = new TreeMap<>();
		List<Float> hList = new ArrayList<>();
		
		for (int i = 0; i < hArray.length; i++) {
			hList.add(Float.parseFloat(hArray[i]));
			map.put(Float.parseFloat(hArray[i]), nArray[i]);
		}
		
		Collections.sort(hList);
		Collections.reverse(hList);
		//System.out.println(hList);
		
		for (Float float1 : hList) {
			orderedNames=orderedNames.concat(map.get(float1)+",");
		}
		
		orderedNames=orderedNames.substring(0,orderedNames.length()-1);
		
		//System.out.println(orderedNames);
		return orderedNames;
	}
	
	public static void main(String[] args) {
		System.out.println(sortHeights("John,Sherlock,Marry","5.5,6.1,5.1"));
		
		System.out.println(sortHeights("Bob,Donald,Joe,Scooby,Johnny","4.6,6.0,5.3,5.1,4.5"));
		
		
		
	}
}


