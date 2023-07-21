package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylist {

	public static void main(String[] args) {


		String arr[] = {"dog", "lion", "horse", "tiger"};
		
		//to read data from array we use for loop
		
		for(String animal: arr) {
			System.out.println(animal);
		}

		ArrayList list = new ArrayList(Arrays.asList(arr));
	 
		System.out.println(list);
		
		//int arr2 [] = {100,120,30,50,90};

	}

}
