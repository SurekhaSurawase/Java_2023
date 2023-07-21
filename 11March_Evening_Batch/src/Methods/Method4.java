package Methods;

public class Method4 {

	public static void main(String[] args) {
		//Static regular method calling from different class
		//Syntax: ClassName.MethodName();
		System.out.println("Main Method Started");
		Method3.DifferentClass();
		Method3.DifferentClass1();
		System.out.println("Main Method Ended");

	}
}
