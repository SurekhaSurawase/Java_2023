package Array;

public class Array_String {

	public static void main(String[] args) {
		
		//String input array
		//Syntax: String arrayaname[] = new String[size of array];
		
		String name [] = new String[5];
		name[0] = "Shiv";
		name[1] = "1234";
		name[2] = "#$%%^^&*";
		name[3] = "Surekha";
		name[4] = "Vaibhav";
		
		//String S1 = new String[-5]; // wecan not declare size of array as -ve
		//Exception: NegativeArraySizeException
		
		System.out.println(name.length);
		
		for(int i = 0; i< name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
