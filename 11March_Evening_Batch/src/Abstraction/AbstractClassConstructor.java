package Abstraction;

public abstract class AbstractClassConstructor {

	public AbstractClassConstructor() {
		this(100);
		//this(100,'E');
		System.out.println("Zero input parameter Abstract class constructor");
	}
	
	public AbstractClassConstructor(int i) {
		System.out.println("one input parameter Abstract class constructor");
	}
	
	public AbstractClassConstructor(int i, char A) {
		System.out.println("Two input parameter Abstract class constructor");
	}
	
	public void Method1() {
		System.out.println("Complete method ");
	}
}
