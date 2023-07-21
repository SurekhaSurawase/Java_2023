package Collection_set;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {


		HashSet HS = new HashSet();
		HS.add("String");
		HS.add(null);
		HS.add(false);
		HS.add("java");
		HS.add('A');
		HS.add(true);
		
		System.out.println(HS);
		
		HashSet HS1 = new HashSet();
		HS1.addAll(HS);
		System.out.println(HS1);
		
		HS1.add('M');
		System.out.println(HS1);
		
		HS1.removeAll(HS);
		System.out.println(HS1);

		HS1.retainAll(HS);
		System.out.println(HS1);
}

}