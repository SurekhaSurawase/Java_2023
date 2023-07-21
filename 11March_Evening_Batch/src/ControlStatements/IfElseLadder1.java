package ControlStatements;

public class IfElseLadder1 {

	public static void main(String[] args) {
		//Calculation of days of week
		
		int day =5;
		if(day==1) {//1==5 false
			System.out.println("Today is Monday");
		}
		else if(day==2) {//2==5 false
			System.out.println("Today is Tuesday");
		}
		else if(day==3) {//3==5 false
			System.out.println("Today is Wednesday");
		}
		else if(day==4) {//4==5 false
			System.out.println("Today is Thursday");
		}
		else if(day==5) {//5==5 true
			System.out.println("Today is Friday");
		}
		else if(day==6) {
			System.out.println("Today is Saturday");
		}
		else if(day==7) {
			System.out.println("Today is Sunday");
		}
		else {
			System.out.println("No match found");
		}
	}
}
