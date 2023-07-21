package Collection_set;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		//HashSet is implementation clas which implements set interface of collection.
		//Duplicates are not allowed in hashSet
		//only once we can add 'null' values
		//Insertion order is not preserved in hashSet
		
		HashSet HS = new HashSet();
		
		HS.add("String");
		HS.add(null);
		HS.add(false);
		HS.add(null);//duplicates are not allowed
		

		System.out.println(HS);
		
		//remove
		HS.remove(false);
		System.out.println(HS);
		
		System.out.println(HS.add("String"));//false because element cant be added to the hashset
		System.out.println(HS.add(101));//true
		System.out.println(HS);
		
		
	}

}
