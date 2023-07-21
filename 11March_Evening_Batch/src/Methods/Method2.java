package Methods;

public class Method2 {

	public static void main(String[] args) {
		//Static Regular Method Calling from Same Class
		//Direct calling.
		Test1();
		Test2();
		System.out.println();
		//Calling by class name
		Method2.Test1();
		Method2.Test2();
		
	}

	public static void Test1() {
		
		System.out.println("Static regular method calling from same class: Test1");
		
	}
	
	public static void Test2() {
		System.out.println("Static regular method calling from same class: Test2");
	}
}
