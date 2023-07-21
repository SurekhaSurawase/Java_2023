package LoopStatements;

public class TableusingLoops {

	public static void main(String[] args) {
	//WAP to print tables 
		System.out.println("Table of 2");
		TableusingLoops.Table(2);//calling by method name
		System.out.println();
		System.out.println("Table of 9");
		TableusingLoops.Table(9);
	}
	
	public static void Table(int k) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum=i*k;
			System.out.print(sum+" ");
		}
		
	}
}
