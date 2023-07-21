package Array;

import java.util.Arrays;

public class Array_char {

	public static void main(String[] args) {
		//char type input to array
		//syntax: char arrayname[] = new char[size of array];
		
		char C1 [] = new char [5]; 
		//char [] C2 = new char[5]; //valid syntax
		
		C1[0] = 'A';
		C1[1] = 'D';
		C1[2] = 'V';
		C1[3] = 'S';
		C1[4] = 'C';
		
		System.out.println(C1.length);//to find size of array
		for (int i = 0; i<C1.length; i++) {
			System.out.print(C1[i]);
			System.out.print(" ");
		}
		
		System.out.println(C1.length);
		//To sort data saved in array
		//Arrays.sort(arrayname);
		System.out.println();
		Arrays.sort(C1);
		System.out.println("Printing sort data using for loop");
		
		for(int j=0; j<5; j++) {
			System.out.print(C1[j]+" ");
		}
		
	}
}
