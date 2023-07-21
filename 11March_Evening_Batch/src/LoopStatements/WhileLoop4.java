package LoopStatements;

public class WhileLoop4 {

	public static void main(String[] args) {
		//WAP  to print sum of first 15 numbers using for and while loop
		
		//using for loop
		int sum=0;
		for(int i=1; i<=15; i++) {//2 3
			sum=sum+i;//2+1=3 3+2=5
		}
		
		System.out.println("Addition of first 15 numbers is: "+sum);
		
		//using while loop;
		int sum1=0;
		int i=1;
		while(i<=15) {
			sum1=sum1+i;
			i++;
		}
		System.out.println("Addition of first 15 numbers is: "+sum1);	
	}

}
