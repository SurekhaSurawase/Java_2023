package ControlStatements;

public class IfElseStatement {

	public static void main(String[] args) {
		//If-else statement
		/*Syntax: if(condition){
		 Statement 1; //Executes when condition is true
		}
		else{ 
		statement 2; //executes when condition is false
	}*/
		
		int marks = 25;
		if(marks>=45) {
			System.out.println("Result is Pass");
		}
		else {
			System.out.println("Result is Fail");
		}
		
		System.out.println("Program completed.");
	}

}
