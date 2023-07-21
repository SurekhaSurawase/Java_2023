package String;

public class String_basics {

	public static void main(String[] args) {
		
		//String is a an object that represents collection of sequence of characters
		//String is a class which is present in "java.lang" package.
		//String is used to store sequence of characters.
		//String is a immutable class
		//String is a final class which do not allow us to chenge the value once declared.
		
	    //There are two ways to declare string.
		//1. by using literal
		//Syntax: String variable_name = "value";
		//2. by using new keyword
		//Syntax: String variable_name = new String("value")'
		
		String S1 = "Shree Gurudev"; //String declaration and initialization using literal.
		String S2 = "Shree Gurudev"; //SCP
		
		String S3 = new String("Shree Gurudev");//String declaration and initialization using new keyword
		String S4 = new String("Shree Gurudev"); //Heap
		
		System.out.println(S1==S2); //true
		System.out.println(S1==S3); // false
		System.out.println(S1.equals(S4)); // true
		
	}
}
