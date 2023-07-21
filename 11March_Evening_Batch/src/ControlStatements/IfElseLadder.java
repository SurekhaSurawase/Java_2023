package ControlStatements;

public class IfElseLadder {

	public static void main(String[] args) {
		/*Syntax:
		 * if(condition1){
		 * Statement 1; //Executes when condition1 is true
		 * }
		 * else if(Condition2){
		 * Statement 2; //Executes when condition 2 is true
		 * }
		 * else if(Condition3){
		 * Statement 3;//Executes when condition 3 is true
		 * }
		 * else{
		 * Statement 4; //Executes when all conditions are false 
		 *} 
		 */
		
		//Determining result of pune university

		int marks = 57;
		if(marks>65) { //57> 65 false
			System.out.println("Result is Distinction");
		}
		else if(marks>60) {//57>60 false
			System.out.println("Result is First class");
		}
		else if(marks>55) {//57>55 true
			System.out.println("Result is Higher second class");
		}
		else if(marks>50) {
			System.out.println("Result is Second class");
		}
		else if (marks>=35) {
			System.out.println("Result is Pass");
		}
		else {
			System.out.println("Result is Fail");
		}
		System.out.println("Program completed");
	}
}
