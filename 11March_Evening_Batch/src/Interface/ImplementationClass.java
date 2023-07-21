package Interface;

public class ImplementationClass implements Demo, Demo2 {

	public static void main(String[] args) {
		
		ImplementationClass IC = new ImplementationClass();
		IC.Test1();
		IC.Test2();
		IC.Test3();
		
		System.out.println();
		Demo IC1 = new ImplementationClass();
		
		IC1.Test1();
		IC1.Test2();
		
		System.out.println();
		Demo2 IC2 = new ImplementationClass();
		IC2.Test3();
		IC2.Test1();
	}

	@Override
	public void Test3() {
		System.out.println("Demo2 interface");
		
	}

	@Override
	public void Test1() {
		System.out.println("Demo1 interface");
		
	}

	@Override
	public void Test2() {
		System.out.println("Demo1 interface");
		
	}

}
