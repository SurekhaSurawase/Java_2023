package AccessModifiers;

public class Protected1 {

	//3. Protected Modifier: Scope of protected modifier is within the class, outside the class, within the package and outside the package too.
	//Outside the package is through child class using inheritance principle.
	
	protected int number = 500;
	
	public static void main(String[] args) {
		
		Protected1 P3 = new Protected1();
		P3.M1();
		P3.M2();
		System.out.println(P3.number);
	}
	
	protected void M1() {
		System.out.println("Protected Method M1");
	}
	
	protected void M2() {
		System.out.println("Protected Method M2");
	}
}
