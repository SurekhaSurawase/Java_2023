package Array;

public class Array_HeteroDataType {

	public static void main(String[] args) {
		
		//Object [] is used to store elements of different datatype i.e heterogenous data
		//Syntax: Object [] obj= new Object[size of array];
		
		Object obj[] = new Object[4];
		
		obj[0] = "Shiv";
		obj[1] = 'A';
		obj[2] = 98.77;
		obj[3] = true;
		
		System.out.println("Length of array: "+obj.length);
		//Arrays.sort(obj); not applicable
		
		for(int j=0; j<obj.length ; j++) {
			System.out.println(obj[j]);
		}
	}
}
