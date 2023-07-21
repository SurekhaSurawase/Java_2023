package Collection_List;

import java.util.LinkedList;

public class LinkedList1 {

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
		
		System.out.println(list);
		
		//2.insert into element
		list.add(2, false);
		list.add(4, "surekha");
		list.add(0, 'A');
		System.out.println(list);
		
		//3. remove
		list.remove(2);
		System.out.println(list);
		list.remove("300");
		System.out.println(list);
		
		//4. size
		System.out.println("Size of list is: "+list.size());
		
		//5.get first element of linkedlist
		System.out.println(list.getFirst());
		
		//6. get last element of list
		System.out.println(list.getLast());
		
		//7. contains: to check if the element is present in the list or not.  returns true if present
		System.out.println(list.contains("surekha"));
		
		//8.isEmpty()
		System.out.println(list.isEmpty());
		
		//8. get(): to retrieve element of specific index
		System.out.println(list.get(3));
		
		//9. set(): replace of change element at specific 

		list.set(2, "testing");
		System.out.println(list);
	}

}
