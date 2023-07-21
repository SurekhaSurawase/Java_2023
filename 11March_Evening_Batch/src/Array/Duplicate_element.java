package Array;

public class Duplicate_element {

	public static void main(String[] args) {
		//Finding duplicate element of array
		
		int number [] = {45,21,45,26,78,49};
		System.out.println(number.length);
		
		for(int i = 0; i< number.length; i++) {
			
			for(int j = i+1; j<number.length; j++ ) {
				
				if(number[i]== number[j]) {
				System.out.println("Duplicate element is: "+number[i]);
			}
			
		}
	}
}
}
