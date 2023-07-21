package Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		//Vector is a legacy class.
		//Duplicates are allowed and any no of null values are allowed.
		//Insertion order is preserved.
		
		Vector VC = new Vector();
		//1. Add elements to vector
		VC.add("welcome");
		VC.add("java");
		VC.add(30.4);
		VC.add('A');
		VC.add(true);
		VC.add(null);
		VC.add("welcome");
		
		System.out.println(VC);
		System.out.println(VC.size());
		
		//remove
		VC.remove(null);
		System.out.println(VC);
		
		//3.get(): retrieve element from specific position
		
		System.out.println(VC.get(2));
		//System.out.println(VC.get(12)); ArrayIndexOutOfBoundsException
		
		//4. set(): to replace or change element at specific position
		
		VC.set(0, 110);
		System.out.println(VC);
		
		//isEmpty(): to check vector is empty or not
		
		System.out.println(VC.isEmpty());
		
		//Read elements from vector
		//Approach1: simple for loop
		System.out.println("Reading elements using for loop");
		for(int i=0; i<VC.size(); i++) {
			System.out.println(VC.get(i));
		}
		
		//Approach2: Advance for loop
		System.out.println("Reading elements using advance for loop");
		for(Object obj: VC) {
			System.out.println(obj);
		}

		//Approach3: by using iterator
		System.out.println("Reading elements using Iterator");
		Iterator itr = VC.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
