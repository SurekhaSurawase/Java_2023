package String;

public class String3 {

	public static void main(String[] args) {

		//Difference between == operator and .equals() method
		
		String S1 = "Java";
		String S2 = "Java";
		
		String S3 = new String("Java");
		String S4 = new String("Java");
		String S5 = new String("java");
		String S6 = "java";
		
		//== operator always compare reference comparison or address comparison. if both the vaiabes point to single memory location or object the value will be true
		
		System.out.println(S1==S2); //true
		System.out.println(S1==S3); //false
		System.out.println(S1==S4); //false 
		System.out.println(S1==S5); //false
		System.out.println(S1==S6); //false
		
		//.equals() method comapre the content saved at the location. If the content saved at both the variables matches the result will be true else not.
		
		System.out.println(S1.equals(S2));//true
		System.out.println(S1.equals(S3)); //true
		System.out.println(S1.equals(S4));//true
		System.out.println(S1.equals(S5)); //false
		System.out.println(S1.equals(S6)); //false

		


	}

}
