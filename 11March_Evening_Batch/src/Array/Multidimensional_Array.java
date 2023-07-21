package Array;

public class Multidimensional_Array {

	public static void main(String[] args) {
		//Multidimensional array is a array who stores values in the form of column and rows.
		
		//Syntax: String [] [] arr = new String [no of rows][no ofcolumns];
		
		String arr [] [] = new String [3][4];
		//First row
		arr[0][0] = "A1";
		arr[0][1] = "A2";
		arr[0][2] = "A3";
		arr[0][3] = "A4";
		
		//Second row
		arr[1][0] = "B1";
		arr[1][1] = "B2";
		arr[1][2] = "B3";
		arr[1][3] = "B4";
		
		//third row
		arr[2][0] = "C1";
		arr[2][1] = "C2";
		arr[2][2] = "C3";
		arr[2][3] = "C4";
		
		System.out.println(arr.length); //total no of rows
		System.out.println(arr[0].length); // total no of columns
	
		System.out.println("Printing table using for loops");
		for(int i = 0; i<arr.length; i++) {
			
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Table completed");
	}
}
