package String;

public class String2 {

	public static void main(String[] args) {
		
		String Str = "Java";
		String Str1 = "Java";
		String Str2 = new String("Java");
		String Str3 = new String("Java");
		
		System.out.println(Str==Str1);//true
		System.out.println(Str==Str2); //false
		System.out.println(Str==Str3);//false
		System.out.println(Str.equals(Str1));//true
		System.out.println(Str.equals(Str2));//true
		System.out.println(Str.equals(Str3));//true

	}

}
