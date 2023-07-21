package Methods;

public class Method1 {

	public static void main(String[] args) {
	//Method is a block of code which runs only when it is called. Aka- functions
	//Methods are used for code re-usability i.e write once and use for multiple times.
	//Without main method we can not execute any java program.
	//When we run the program main method gets called automatically but regular methods are required to be called in main method
	//Two types: Main method and Regular Method
		
		//We can call method by 2 ways
		//1. Direct calling: Syntax: MethodName();
		
		M1();
		M2();
		
		//2. Calling by class name: Syntax: ClassName.MethodName();
		Method1.M1();
		Method1.M2();
	}
	
	public static void M1() {
		System.out.println("Regular Method: M1");
	}
	
	public static void M2() {
		System.out.println("Regular Method: M2");
	}
}
