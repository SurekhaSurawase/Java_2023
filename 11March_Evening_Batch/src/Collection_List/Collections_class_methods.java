package Collection_List;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_class_methods {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Collections ia a utility class which has its own methods as sort, reverseorder, shuffle etc.
		
		ArrayList Arr = new ArrayList();
		//first preference will be given to Capital and then to small case
		Arr.add('S');
		Arr.add('b');
		Arr.add('M');
		Arr.add('V');
		Arr.add('A');
			
		System.out.println("Printing original lsit");
		System.out.println(Arr);
		//1. sort(): to sort arraylist in ascending order
		System.out.println("After sorting");
		
		Collections.sort(Arr);
		System.out.println(Arr);

		//2.reverseOrder: to print arraylist in reverseOrder.
		
		System.out.println("Printing arraylist in reverse order");
		Collections.sort(Arr, Collections.reverseOrder());
		System.out.println(Arr);
		
		System.out.println("Printing arraylist in shuffle");
		Collections.shuffle(Arr);
		System.out.println(Arr);
	}

}
