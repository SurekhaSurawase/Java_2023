package Polymorphism;

public class MethodOverloading1 {

	//Polymorphism: One object showing different behavior at different stages is called as Polymorphism
	//2 Types: Compile time Polymorphism and Run-Time Polymorphism
	
	//1. Compile time polymorphism: Method definition and method Declaration are binded during compilation time
	//on the basis of argument or input parameter is called as Compile time polymorphism
	
	//Method Overloading : When method name is same with different arguments and DataTypes it is called as Compile
	//time polymorphism
	public static void main(String[] args) {

		MethodOverloading1 Obj = new MethodOverloading1();
		Obj.Demo1();
		Obj.Demo1(10);
		Obj.Demo1("Shiv");
		Obj.Demo1(10,20);
		Obj.Demo1(11, "Shiv");
		Obj.Demo1(10,20,30d);
	}
	
	public void Demo1() {
		System.out.println("Zero argument Method");
	}
	
	public void Demo1(int i) {
		System.out.println("One argument Method");
	}
	
	public void Demo1(String name) {
		System.out.println("One argument Method");
	}
	
	public void Demo1(int i, int j) {
		System.out.println("Two argument Method");
	}
	
	public void Demo1(int RollNo, String Name) {
		System.out.println("Two argument Method");
	}
	
	public void Demo1(int i, int j, double k) {
		System.out.println("Three argument Method");
	}

}
