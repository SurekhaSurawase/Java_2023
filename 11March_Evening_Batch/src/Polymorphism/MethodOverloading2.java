package Polymorphism;

public class MethodOverloading2 {

	//We can overload static method, non-static method and Main method too
	public static void main(String[] args) {

		MethodOverloading2.Method1();
		MethodOverloading2.Method1("Surekha");
		MethodOverloading2.Method1(10,20);
		MethodOverloading2.main(50, 70);
	}
	
	public static void Method1() {
		System.out.println("Zero argument static method");
	}
	
	public static void Method1(String Name) {
		System.out.println("One argument static method");
	}
	
	public static void Method1(int i, int j) {
		System.out.println("Two argument static method");
	}

	public static void main(int i, int j) { //Main method can be overloaded by changing arguments
		int c = i+j;
		System.out.println(c);
	}
}
