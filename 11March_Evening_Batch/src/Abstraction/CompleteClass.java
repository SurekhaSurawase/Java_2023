package Abstraction;

public class CompleteClass {

	//A class in which method declaration and method definition are present for every method is called as Complete Class
	public static void main(String[] args) {
		CompleteClass CC = new CompleteClass();
		CC.Demo1();
		CC.Demo2();
		Demo3();
	}
	
	public void Demo1() {
		System.out.println("Complete Method--- Demo1");
	}
	
	public void Demo2() {
		System.out.println("Complete Method--- Demo2");
	}
	
	public static void Demo3() {
		System.out.println("Static method-- Demo3");
	}
}
