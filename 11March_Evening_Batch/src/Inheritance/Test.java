package Inheritance;

public class Test {

	public static void main(String[] args) {

		Son obj = new Son();
		obj.Bike();
		obj.Car();
		obj.Money();
		obj.Home();
		
		System.out.println();
		
		Father obj1 = new Father();
		obj1.Car();
		obj1.Home();
		obj1.Money();
	
		
	}

}
