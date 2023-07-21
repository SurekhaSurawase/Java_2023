package Casting;

public class Casting4 extends Casting3{

	public static void main(String[] args) {
		
		Casting4 C1 = new Casting4();//Static binding
		C1.Demo1();
		C1.Demo2();
		C1.Test();
		
		Casting3 C2 = new Casting4(); //RTP, Dynamic poly, Upcasting
		C2.Demo1();
		C2.Demo2();
		//C2.Test not allowed as reference of parent class is provided
		
		Casting4 C3 = (Casting4) new Casting3();//Downcasting 
		//downcasting is not allowed in java. ClassCastException is thrown
		
		C3.Demo1();
		C3.Demo2();
	}
	
	public void Test() {
		System.out.println("Test Method");
	}

}
