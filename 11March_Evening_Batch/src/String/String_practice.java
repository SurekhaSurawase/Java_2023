package String;

public class String_practice {

	public static void main(String[] args) {
		String S1= "Hello";
		String S2= "Hello";
		
		System.out.println(S1.charAt(1));//e
		System.out.println(S1.equals(S2));//true
		System.out.println(S1.substring(1,4));//ell
		System.out.println(S1.toUpperCase());//HELLO
		System.out.println(S1.indexOf('o'));//4
	}
}
