package Array;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		//Finding largest number of array
		
		int num [] = {123,564,789,1234,124,23,45};
		int maximum = 123;
		for(int i =0; i<num.length; i++) {
			
			if(num[i]>maximum) {
				maximum = num[i];
			}
		}
		System.out.println("Largest number is: "+maximum);
	}

}
