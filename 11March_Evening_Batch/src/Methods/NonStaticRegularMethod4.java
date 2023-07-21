package Methods;

public class NonStaticRegularMethod4 {

	public static void main(String[] args) {
		//Non-Static regular method calling from different class
		System.out.println("Main method started");
		System.out.println();
		
		NonStaticRegularMethod3 obj = new NonStaticRegularMethod3();
		obj.Demo1();
		obj.Demo2();
		NonStaticRegularMethod3.Demo3();//Calling by class name as static method
		System.out.println();

		//As Demo4 is present in same class new object creation is required 
		NonStaticRegularMethod4 obj1 = new NonStaticRegularMethod4();
		obj1.Demo4();
		System.out.println("Main method Ended");
	}
	
	public void Demo4() {
		System.out.println("Non-Static regular method calling from same class: Demo4");
	}
}
