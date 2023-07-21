package Casting;

public class ImplicitCasting2 {

	public static void main(String[] args) {
		
		//Explicit casting: Converting higher datatypes into lower datatypes
		
		float F = 55.55f; //55
		
		System.out.println(F);
		
		int i = (int) F;//here float variable is converted to int variable by rounding off to 55
		
		System.out.println(i);
		
		double D = 45789763d;
		
		int j = (int) D;
		System.out.println(j);
		
		String Str = "ABCD";
		
		System.out.println(Str);
		//char C = Str; // not allowed for char data

	}

}
