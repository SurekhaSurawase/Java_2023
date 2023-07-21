package Collection_set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet LHS = new LinkedHashSet();
		//LinkedHashSet is same as Hashset
		//Default capacity is 16 and load factor is 0.75
		//only diff is insertion order is preserved in linkedHashSet
		
		LHS.add("java");
		LHS.add('D');
		LHS.add('D');//duplicates are not allowed
		LHS.add('v');
		LHS.add(null);
		LHS.add(true);
		
		System.out.println(LHS);//insertion order is preserved
		System.out.println(LHS.add(null));//false
		System.out.println(LHS.add(4546));

	}

}
