package ControlStatements;

public class SimpleIfStatement1 {

	public static void main(String[] args) {
		//Simple if condition
		
		int marks=50;
		int marks1= 20;
		
		if(marks>=35) {
			System.out.println("Result is Pass");
		}
		
		if(marks1>=35) {//here condition is false hence loop will not executed
			System.out.println("Result is Pass");
		}
		System.out.println("Program Completed");
	}
}
