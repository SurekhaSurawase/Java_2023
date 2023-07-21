package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// HashMap is a class which implements Map Interface and it is not a part of
		// collection so behaves differently.
		// Declaration

		HashMap<Integer, String> HM = new HashMap<>();

		// to add elements in the hashmap class.
		HM.put(101, "Surekha");
		HM.put(110, "vaibhav");
		HM.put(105, null);
		HM.put(201, "Java");
		HM.put(181, "Automation");
		HM.put(501, null);

		System.out.println(HM);
		// HashMap can store element in key, value pair
		// Key can not be null and must be unique.
		// value can be duplicates and no of null values are allowed.

		// to retrieve specific element we use get();
		System.out.println(HM.get(110));

		// containsKey(); returns true if element is present
		System.out.println(HM.containsKey(181));
		System.out.println(HM.containsValue(null));

		// isEmpty()
		System.out.println(HM.isEmpty());

		// setKey(); Returns a Set view of the keys contained in this map.The set is
		// backed by the map,
		// so changes to the map arereflected in the set, and vice-versa. If the map is
		// modifiedwhile an iteration
		// over the set is in progress (except throughthe iterator's own remove
		// operation), the results ofthe iteration are undefined.

		System.out.println(HM.keySet());
		System.err.println(HM.values());

		System.out.println("to trace the all keys values using Advance for loop");
		// to trace the all key values using Advance for loop
		for (Object obj : HM.keySet()) {
			System.out.print(obj+"||" );
		}

		System.out.println();
		System.out.println("to trace the all values using Advance for loop");
		// to trace the all values using Advance for loop
		for (Object obj : HM.values()) {
			System.out.print(obj+"||");
		}

		System.out.println();
		System.out.println("to print the pair");
		//to print the pair
		for(Object obj1: HM.keySet()) {
			System.out.print(obj1+" "+HM.get(obj1)+"||");
		}
		
		System.out.println();
		System.out.println("Using Entry method");
		for(Map.Entry entry: HM.entrySet()) {
			System.out.print(entry.getKey()+" "+entry.getValue()+"||");
		}
		
		System.out.println();
		System.out.println("using Iterator");
		
		Set s = HM.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry entry1 = (Entry) itr.next();
			System.out.print(entry1.getKey()+" "+entry1.getValue()+"||");
		}
	}

}
