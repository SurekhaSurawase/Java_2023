package Abstraction;

public class ConcreateClass extends sample1{

	public static void main(String[] args) {
		ConcreateClass CC = new ConcreateClass();
		CC.Demo1();
		CC.Demo2();
		CC.Demo3();
		
		System.out.println();
		sample1 CC1 = new ConcreateClass();
		CC1.Demo1();
		CC1.Demo2();

	}

	@Override
	public void Demo1() {
		System.out.println("Demo1");
		
	}

	@Override
	public void Demo2() {
		System.out.println("Demo2");
		
	}

	public void Demo3() {
		System.out.println("Demo3");
	}
}
