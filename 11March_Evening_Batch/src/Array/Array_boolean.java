package Array;

public class Array_boolean {

	public static void main(String[] args) {
		//Boolean type of data
		
		//Syntax: boolean arrayname[] = new boolean[size of array];
		
		boolean B1 [] = new boolean[3];//array declaration
		B1[0] = true;
		B1[1] = false;
		B1[2] = true; // array initialization
		System.out.println("array boolean");
		System.out.println(B1.length);
		for(int i = 0; i<3; i++) {
			System.out.println(B1[i]);
		}
		
	}
}
