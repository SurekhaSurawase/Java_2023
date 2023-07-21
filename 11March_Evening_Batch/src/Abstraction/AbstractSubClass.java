package Abstraction;

public class AbstractSubClass extends AbstractClassConstructor {

	public AbstractSubClass() {
		super();
		System.out.println("Sub class constructor");
	}
	
	public static void main(String[] args) {
		AbstractSubClass AC = new AbstractSubClass();

		AC.Test();
		
	}
	
	public void Test() {
		System.out.println("Calling abstract class constructor");
	}
}
