package Array;

import java.util.Arrays;

public class Reverse_order {

	public static void main(String[] args) {
		
		//Printing array in reverse order.
		
		int arr [] = {4,9,5,65,23,78,43};
		System.out.println("Length of array is: "+arr.length);
		
		System.out.println("Printing original array");
		for(int i= 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Printing array in reverse order");
		for(int j= arr.length - 1; j>0; j--) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Array in ascending order");
		Arrays.sort(arr);
		
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Printing array in descending order");
		for(int a= arr.length-1; a>0; a--) {
			System.out.print(arr[a]+" ");
		}
		System.out.println();
	}
}
