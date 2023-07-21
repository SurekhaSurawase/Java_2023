package String;

public class String_Immutable {

	public static void main(String[] args) {
//		Immutable means we can not change the value once declare.
//		Once we create an object using string java do not allow to perform changes.
//		If we r trying to perform changes, with those changes new object is created.
		
		String S1 = "Automation";
		String S2 = "Automation";
		String S3 = "Automation";
		
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		System.out.println();
		S1 = "Java";
		System.out.println(S1); //here only value for S1 is changed by creating new object for the same
		System.out.println(S2);
		System.out.println(S3);

	}

}
