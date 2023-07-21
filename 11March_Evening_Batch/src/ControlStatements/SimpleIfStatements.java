package ControlStatements;

public class SimpleIfStatements {

	//Control Statements: Statements used to control flow of execution of program.
	
	public static void main(String[] args) {
		//If-Statement:
		/*Syntax:
		 * if(condition){
		 *statement 1; //Executes when condition is true
		 * }
		 */
		
		int i= 20;
		int j = 30;
		int k =i+j;
		if(k>=30) {
			System.out.println("Addition is greater than 30");
		}
		
		System.out.println("Main method ended");
	}
}
