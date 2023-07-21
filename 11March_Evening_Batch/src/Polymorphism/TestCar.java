package Polymorphism;

public class TestCar {

	public static void main(String[] args) {
		Car_MethodOverriding C1 = new Car_MethodOverriding(); 
		C1.Start();
		C1.Stop();
		C1.Refuel();
		System.out.println();
		
		Maruti M1 = new Maruti();
		M1.Start();
		M1.Theftydyfty();
		M1.Stop();
		M1.Refuel();
		System.out.println();
		
		Car_MethodOverriding C2 = new Maruti(); //Dynamic poly/ Runtime poly
		C2.Start();
		C2.Stop();
		C2.Refuel();
		//C2.Theftydyfty(); not allowed
	}

}
