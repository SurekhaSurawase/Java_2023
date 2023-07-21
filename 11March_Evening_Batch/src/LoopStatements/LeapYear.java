package LoopStatements;

public class LeapYear {

	public static void main(String[] args) {
		//Calculating leap year
		
		int year = 2010;
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("Year is leap year "+year);
		}
		else {
			System.out.println("Year is not leap year "+year);
		}
		System.out.println("Loop completed");
	}
}
