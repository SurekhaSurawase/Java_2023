package AccessModifierDifferentPackage;

import AccessModifiers.Protected1;
import AccessModifiers.Public1;

public class Test extends Protected1 {

	public static void main(String[] args) {

		Public1 P1 = new Public1(); //Scope of public modifier is outside the package too.
		P1.Demo1();
		P1.Demo2();
		
		Test P3 = new Test();
		P3.M1();
		P3.M2();
		System.out.println(P3.number);
		System.out.println();
	}

}
