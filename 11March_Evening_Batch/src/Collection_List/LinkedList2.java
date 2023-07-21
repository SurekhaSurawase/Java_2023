package Collection_List;

import java.util.LinkedList;

public class LinkedList2 {

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
		
		LinkedList LL = new LinkedList();

		LL.addAll(list);
		System.out.println(LL);
		
		LL.add("Shiv");
		System.out.println(LL);
		
		LL.removeAll(list);
		System.out.println(LL);
		
		System.out.println("Collections Method");
		
		LinkedList LL1 = new LinkedList();
		LL1.add('V');
		
	}

}
