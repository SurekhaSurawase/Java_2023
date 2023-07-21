package Polymorphism;

public class Son extends Father {

	public static void main(String[] args) {
		
		Father F1 = new Father();
		F1.car();
		F1.Money();
		F1.Home();
		System.out.println();
		
		Son S1 = new Son(); //Static polymorphism/ Compile time polymorphism
		S1.car();
		S1.Bike();
		S1.Home();
		S1.Money();
		System.out.println();
		
		Father F2= new Son(); //Dynamic polymorphism/ Run-time poly / top casting
		//When we create child class object with reference to parent class we can only call methods present in super class only.

		F2.car(); //Ertiga
		F2.Home();
		F2.Money();
		//F2.bike not allowed as method is present in child class
		
		//Son S2 = new Father(); Down casting
	}
	
	public void Bike() {
		System.out.println("Bike--> CBZ");
	}
	
	public void car() {
		System.out.println("Car--Ertiga");
	}
}
