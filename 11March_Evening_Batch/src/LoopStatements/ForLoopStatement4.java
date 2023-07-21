package LoopStatements;

public class ForLoopStatement4 {

	public static void main(String[] args) {
		
		//WAP of addition of first 20 numbers
		int sum = 0;
		for(int i=1; i<=20; i++) {
			sum = sum+i;
		}
		System.out.println("Addition of first 20 numbers is: "+sum);
		
		//WAP to add odd numbers between 1 to 20

		int sum1=0;
		for(int i=1; i<=20; i=i+2) {
			sum1 = sum1+i;
		}
			System.out.println("Additin is: "+sum1);
	
	}		
	}
