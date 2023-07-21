package ControlStatements;

public class IfElseStatement1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a*b;
		
		if(c>100) {
			System.out.println("Multiplication is greater than 100");
		}
		else {
			System.out.println("Multiplication is less than 100");
		}
		
		System.out.println("Program completed");
	}
}
