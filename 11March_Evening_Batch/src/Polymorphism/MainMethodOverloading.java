package Polymorphism;

public class MainMethodOverloading {

	//We can overload main method with different arguments
	
	 public static void main(String[] args) {
		System.out.println("Main method with default syntax");
		int arr[] = {45655};
		MainMethodOverloading.main(arr);
		MainMethodOverloading.main('A');
		
	}
	
	public static void main(int[] i) {
		System.out.println("Main method with int array input");
		//System.out.println(i);	
	}
	
	public static void main(char args) {
		System.out.println("Main method with char array inputs");	
	}
	
	
}
