package HierarchicalInheritance;

public class Test {

	public static void main(String[] args) {

		Father F1 = new Father();
		F1.Car();
		F1.Home();
		F1.Money();
		System.out.println();
		
		Son1 S1 = new Son1();
		S1.Bike();
		S1.Car();
		S1.Home();
		S1.Money();
		System.out.println();
		
		Son2 S2 = new Son2();
		S2.Mobile();
		S2.Car();
		S2.Home();
		S2.Money();
		System.out.println();
		
		Son3 S3 = new Son3();
		S3.Laptop();
		S3.Car();
		S3.Home();
		S3.Money();
	}
}
