package MapInterface;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> HT = new Hashtable<>();
		//to add element to the hashtable
		//HT.put(10, null);  java.lang.NullPointerException
		HT.put(108, "Shiv");
		HT.put(101, "Samu");
		HT.put(15, "Sarika");
		HT.put(121, "Gauri");
		HT.put(123, "Gaurav");
		System.out.println(HT);
		
		System.out.println(HT.remove(15));
		
		System.out.println(HT.containsKey(121));
		System.out.println(HT.containsValue("Gaurav"));
		
		//to print the all elements
		
		for(Object obj: HT.keySet()) {
			System.out.println(obj+" "+HT.get(obj));
		}
	}

}
