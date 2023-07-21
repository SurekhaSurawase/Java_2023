package AccessModifiers;

public class Private1 {

	//2. Private: Scope of private modifier is only within the class.this is used for security purpose and for credentials.
	
	private String Name = "Surekha";
	
	public static void main(String[] args) {
		
		Private1 P2 = new Private1();
		P2.Method1();
		P2.Method2();
		System.out.println(P2.Name);
		
	}
	
	private void Method1() {
		System.out.println("Private Method--  Method1");
	}
	
	private void Method2() {
		System.out.println("Private Method--  Method2");
	}
}
