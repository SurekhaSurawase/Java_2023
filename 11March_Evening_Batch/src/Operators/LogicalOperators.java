package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		//Logical operators: && and || operators
		
		boolean A = true;
		boolean B = true;
		boolean A1 = true;
		boolean B1 = false;
		boolean A2 = false;
		boolean B2= true;
		boolean A3 = false;
		boolean B3 = false;
		
		System.out.println("Output of && Operator");
		System.out.println(A&&B);
		System.out.println(A1&&B1);
		System.out.println(A2&&B2);
		System.out.println(A3&&B3);
		System.out.println();
		
		System.out.println("Output of || operator");
		System.out.println(A||B);
		System.out.println(A1||B1);
		System.out.println(A2||B2);
		System.out.println(A3||B3);
	}
}
