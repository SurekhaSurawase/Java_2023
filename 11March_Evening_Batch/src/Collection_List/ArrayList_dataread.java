package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_dataread {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		
		list.add(12);
		list.add("java");
		list.add("Automation");
		list.add(32.54);
		list.add("python");
		list.add(false);
		
		//To find out size of arraylist
		System.out.println(list.size());
		//to print arraylist
		System.out.println(list);
		
		System.out.println();
		System.out.println("Method1: Reading element in arraylist using for loop");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println();
		System.out.println("Method2: Reading elements of arraylist by using advance for loop");
		
		//Syntax: for(datatype varname: arraylist|collection){
		//body of code
		//}
		
		for(Object obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Method3: Reading elements in arraylist using iterator");
		
		//Iterator: it is an interface and reurns true if arraylist has more elements.
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){//hasNext(): Returns true if the iteration has more elements.
			//(In other words, returns true if next wouldreturn an element rather than throwing an exception.)
			
			System.out.println(itr.next()); //returns the next element of iterator
		}
		
	}

}
