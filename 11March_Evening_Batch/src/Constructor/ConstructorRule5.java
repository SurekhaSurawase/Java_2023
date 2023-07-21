package Constructor;

public class ConstructorRule5 {
	
	//Any number of constructor can be created in the class having constructor name as class name but having diff argument

	public static void main(String[] args) {
//		ConstructorRule5 C1 = new ConstructorRule5();
//	//	ConstructorRule5 C2 = new ConstructorRule5(10);
//		ConstructorRule5 C3 = new ConstructorRule5(10,20);
//		ConstructorRule5 C4 = new ConstructorRule5(10,20,30);

	}
	
	public ConstructorRule5(){
		System.out.println("Zero input parameter constructor");
	}
	
	public ConstructorRule5(int i) {
		System.out.println("One input parameter constructor");
	}
	
	public ConstructorRule5(int i, int j) {
		System.out.println("Two input parameter constructor");
	}
	
	public ConstructorRule5(int i, int j, int k) {
		System.out.println("Three input parameter constructor");
	}
}
