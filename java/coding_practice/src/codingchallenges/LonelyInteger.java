package codingchallenges;

import java.util.Arrays;

public class LonelyInteger {
	
	public static int loneInt(int[] a) {
	System.out.println("number of integers: " + a.length);
		if(a.length==1) // if there's only one element in the array, return it.
			return a[0];
		
		Arrays.sort(a); // sort the array
		
		for(int i=0; i<a.length; i+=2) { // check every other element in the sorted array
			if(i==a.length-1) { // if we get to the last element in a sorted array 
				return a[i];    // it's the lone int, return it.
				
			} else if(a[i]!=a[i+1]) { // else check element and the one after it to see if they match
				return a[i];          // if the following element isn't a match the we've found the lone int
			}
		}
		return -1;
	}
	
	public static void main (String[] args) {
		int[] a = {1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(loneInt(a));
	}
}

/*
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 * 
 */
 