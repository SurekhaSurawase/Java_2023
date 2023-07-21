package Array;

import java.util.Arrays;

public class DeclarationAndInitializationSameTime {

	public static void main(String [] args) {
		//Array declaration and initialization at the same time
		
		int arr [] = { 2,4,8,235,421,1};
		System.out.println(arr.length);
		
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	    System.out.println();
	    
	    System.out.println("Sorted array");
	    Arrays.sort(arr);
	    for(int j=0; j<arr.length; j++) {
	    	System.out.print(arr[j]+" ");
	    }
	}
}