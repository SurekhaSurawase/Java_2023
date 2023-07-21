package Methods;

public class MethodWithoutParameter {

	public static void main(String[] args) {
		//Methods with zero input parameter or without parameters
		System.out.println("Main method started");
		
		MethodWithoutParameter.Test1(); //Calling by class name
		MethodWithoutParameter.Test2();
		
		System.out.println("Main method Ended");

	}
	
	public static void Test1() {//Method without parameter
		int a = 10;
		int b = 50;
		int c = a+b;
		System.out.println("Addition of two numbers is : "+c);
		}
	
	public static void Test2() {
		int a= 40;
		int b= 78;
		int c=a*b;
		System.out.println("Multiplication of two numbers is : "+c);
	}
}
