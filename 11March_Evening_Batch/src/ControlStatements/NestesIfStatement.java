package ControlStatements;

public class NestesIfStatement {

	public static void main(String[] args) {
		//Nested if statement
		/*Syntax:
		 * if(Condition 1){
		 * statement 1; //Executes when condition 1 is true
		 * if(Condition 2){
		 * Statement 2; // Executes when condition 2 is true
		 * }
		 * }
		 * else{
		 * Statement 3; //executes when all conditions are false
		 * } */
		
		//check greatest number among given number
		
		int a = 500;
		int b = 800;
		int c = 2000;
		
		if(a>b) {//1500>800 true
			if(a>c) { //1500>2000 false
				System.out.println("a is greatest number");
			}	
			else {
				System.out.println("C is greatest number");
			}		
		}
		else if(b>c) {
				System.out.println("b is greatest number");
			}
		else {
			System.out.println("c is greatest number");
		}	
	}
}
