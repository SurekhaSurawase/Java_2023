package AccessModifiers;

public class Public1 {

	//Access Modifiers in java are used to specify the scope or accessibility of the field of variables, class, methods and constructors.
	//We can change the accessibility by applying access modifiers to the method,constructor or class.
	//there are 4 types: public, private, protected and default
	
	//1. Public modifier: Scope of this is inside the class, outside the class, within the package and outside the package.
	
	public int i = 100; //NSGV declared as public
	
	public static void main(String[] args) {
		
		Public1 P1 = new Public1();
		P1.Demo1();
		P1.Demo2();
	}
	
	public void Demo1() {
		System.out.println("Public method-- Demo1");
	}
	
	public void Demo2() {
		System.out.println("Public method-- Demo2");
	}
}
