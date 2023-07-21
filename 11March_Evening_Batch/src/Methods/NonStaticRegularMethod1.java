package Methods;

public class NonStaticRegularMethod1 {

	public static void main(String[] args) {
		//Non static regular method calling from same class/
		//Static keyword is not used while initializing.
		
		System.out.println("Main Method Started.");
		//We can not call non static method by method name i.e Direct calling and calling by class name.
		//To call a non-static method Object creation is required.
		//After creating a object reference variable name, copy of all non-static methods gets stored in JVM memory which was allocated.
	
		//Object is created using 'new' keyword.
		//Syntax: ClassName ReferenceVariableName = new ClassName();
		//Usage: ReferenceVariableName.MethodName()

		NonStaticRegularMethod1 obj = new NonStaticRegularMethod1();
		obj.Demo1();
		obj.Demo2();
		System.out.println("Main Method Ended");
	
	}
	
	public void Demo1() {
		System.out.println("Non-Static Regular Method calling from same class: Demo1");
		
	}
	
	public void Demo2() {
		System.out.println("Non-Static Regular Method calling from same class: Demo2");
	}
	
}
