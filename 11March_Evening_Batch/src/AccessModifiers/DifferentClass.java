package AccessModifiers;

public class DifferentClass {

	public static void main(String[] args) {

		Public1 P1 = new Public1(); //Scope of public modifier is outside the class too.
		P1.Demo1();
		P1.Demo2();
		System.out.println();
		
//		Private1 P2 = new Private1(); // scope of private modifier is only within the class. Here not allowed
//		P2.Method1();
		
		Protected1 P3 = new Protected1();
		P3.M1();
		P3.M2();
		System.out.println(P3.number);
		System.out.println();
		
		Default1 P4 = new Default1();
		P4.Method1();
		P4.Method2();
		System.out.println(P4.i);
	}

}
