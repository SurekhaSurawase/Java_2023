package Abstraction;

public abstract class IncompleteClass {

	public static void main(String[] args) {
		//IncompleteClass IC = new IncompleteClass(); not allowed for abstract class
	}
	public void Test1() {
		System.out.println("Test Method---Complete Method");
	}
	
	public abstract void Demo();
	public abstract void Demo1();
	
}
