package Array;

public class Array_Basics {

	//Array is a collection of similar type of elements/values.
	//Array are fixed in size i.e to overcome this problem arraylist is used or collections.
	//We can store values of only similar data types. To overcome this Object array is used.
	
	//Array is index based and first index is 0th index and last one is (n-1)th index...
	
	//1. Array Decalaration
	//Syntax:
	// datatype arrayname[] = new datatype[Size of array];
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
	//2. Array Initialization
	//Syntax: arrayname[index] = value;
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		//arr[5] = 15; compiler will not show error but after execution exception will be thrown as ArrayIndexOutOfBoundException.
		
	//3.Array usage
	//System.out.println(arr[index]);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//to check length of array
		System.out.println(arr.length);
		
		System.out.println("Printing array using for loop");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}		
}
