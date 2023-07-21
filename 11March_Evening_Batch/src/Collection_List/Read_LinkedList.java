package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Read_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		
		//1. Add()
		list.add("Java");
		list.add("Automation");
		list.add("python");
		list.add("100");
		list.add("300");
		list.add("30.5");
		list.add(true);
		list.add(null);
		
		System.out.println("Reading elements using for loop");
		//1. using for loop
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("Reading elements using advance for loop");
		//2.using advance for loop
		for(Object obj: list) {
			System.out.print(obj+" ");
		}
		System.out.println();
		
		//3. using iterator
		System.out.println("Reading elements using Iterator");
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
