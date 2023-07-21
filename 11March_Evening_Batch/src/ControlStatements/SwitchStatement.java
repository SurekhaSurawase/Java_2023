package ControlStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		
		//Switch Statements:
		//Syntax:
//		switch(key) {
//		case 1
//		//statement
//		case 2
//		//statement
//		case 3
//		//statement
//		case 4
//		//statement
//		default statement executes when all cases are false.
//		
//		}
		int num = 200;
		switch (200) {
		case 10:
			System.out.println("Matched number: 10");
		case 20:
			System.out.println("Matched number: 20");
		case 100:
			System.out.println("Matched number: 100");
		case 200:
			System.out.println("Matched number: 200");
			break;
		default: System.out.println("No match found");
		}
	
		System.out.println();
		char ch = 'A';
		switch('A') {
		case 'B': System.out.println("Match found");
		case 'V': System.out.println("Match found");
		case 'S': System.out.println("Match found");
		case 'T': System.out.println("Match found");
		case 'M': System.out.println("Match found");
		break;
		default: System.out.println("No Match found");
		}
	}

}
