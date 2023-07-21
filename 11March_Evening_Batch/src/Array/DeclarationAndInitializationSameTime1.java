package Array;

public class DeclarationAndInitializationSameTime1 {

	public static void main(String[] args) {
		//Multidimensional array declaration and initialization at the same time
		//Size: 4*3;
		
		int arr [] [] = {{1,2,4},{4,87,45},{78,12,23},{14,56,42}}; 
		
		System.out.println("Rows of array are : "+arr.length);
		System.out.println("Coulmns of array are: "+arr[0].length);
		
		System.out.println("Printing multidimensional array using for loops");
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0; j< arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Table completed");
	}
}
