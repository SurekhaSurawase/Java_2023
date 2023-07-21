package Collection_List;


import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//Arraylist is a class available in java util package which implements the list interface of collection.
		//List can store duplicate values
		//List can store multiple null values
		//Insertion order is preserved in list
		
		ArrayList Al = new ArrayList();//declaration of arraylist
		//by default size of arraylist is 10 and it can be increased or decreased as per requirements
		
		//1.add()
		Al.add("Surekha");
		Al.add(100);
		Al.add(true);
		Al.add(null);
		Al.add(false);
		Al.add('C');
		Al.add(3.5);
		
		System.out.println(Al);
		//2. size()
		System.out.println("Size of arraylist is: "+Al.size());
		
		//3.remove: removes element from the  arraylist.
		Al.remove(3.5);
		System.out.println(Al);
		
		//4. isEmpty: returns boolean value true if there is no element present in the arraylist
		System.out.println(Al.isEmpty());

		//5. insert new element at specific position: for this we use add(int index, value) method
		
		Al.add(4, 'Z');
		System.out.println(Al);
		
		//6. replace/change value at specific position we will use set()method of arraylist
		
		Al.set(2, "Shiv");
		System.out.println(Al);
		
		//7. Retrieve data from arraylist we use get() method in printing statement
		
		System.out.println(Al.get(5));
		
		//8. create duplicate arraylist :  use addAll() to dupliate the arraylist in new one.
		System.out.println("Duplicate arraylist from old one");
		ArrayList Duplicatelist = new ArrayList();
		
		Duplicatelist.addAll(Al);
		System.out.println(Duplicatelist);
		
		//9. Removeall element from arraylist use removeAll()
		
		Duplicatelist.removeAll(Duplicatelist);
		System.out.println(Duplicatelist);
		
	}

}
