package Methods;

public class NonStaticRegularMethod2 {

	public static void main(String[] args) {
		//Non-Static Regular Method calling from same class
		System.out.println("Main method started");
		M1(); //Direct calling
		NonStaticRegularMethod2.M1();//Calling by class name
		System.out.println();
		//Non-static regular methods are called by creating object
		NonStaticRegularMethod2 obj1 = new NonStaticRegularMethod2();
		obj1.M2();
		obj1.M3();
		System.out.println("Main method ended");
	}
	
	public static void M1() {
		System.out.println("Static regular method calling from same class: M1");
	}
	
	public void M2() {
	System.out.println("Non-static regular method calling from same class: M2");	
	}
	
	public void M3() {
		System.out.println("Non-Static regular method calling from same class: M3");
	}
}
