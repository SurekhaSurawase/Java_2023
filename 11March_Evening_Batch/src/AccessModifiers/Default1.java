package AccessModifiers;

public class Default1 {

	//4.Default Modifier: Scope is throughout the package. Cannot be accessed outside the package and
	//when we do not use any modifier it is considered as Default.
	
	int i = 200;
	public static void main(String[] args) {
		
		Default1 P4 = new Default1();
		P4.Method1();
		P4.Method2();
		System.out.println(P4.i);
		
	}
	
	void Method1() {
		System.out.println("Default Method -- Method1");
	}
	
	void Method2() {
		System.out.println("Default Method -- Method2");
	}
}
 