package Array;

public class ArraySum {

	public static void main(String []  args) {
		
		//Sum of Array
		
		int arr[] = {45,23,48,96,37,85};
		System.out.println("Length of array is: "+arr.length);
		
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum  = sum + arr[i];
		}
		
		System.out.println("Sum of Array is: "+sum);
		
	}
}
