package codingchallenges;

/*
write code to swap the first element with the last element. 
Don't just replace the numbers, but swap them. 
You can create any additional local variables that you need 
and feel free to use the length property wherever possible. 
Also, don't use any specialized classes like Arrays.
*/ 

public class SwapElements {
	
	public static void main(String[] args) {
		int[] elements = {1,2,3,4,5};
		
		//store first and last elements in variables 
		int firstElement = elements[0];
		int lastElement = elements[elements.length - 1];
		
		// swap em!
		elements[0] = lastElement;
		elements[elements.length - 1] = firstElement;
		
		// print the array	
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	} 

}
