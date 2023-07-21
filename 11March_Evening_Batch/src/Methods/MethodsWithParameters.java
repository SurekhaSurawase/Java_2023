package Methods;

public class MethodsWithParameters {

	public static void main(String[] args) {
		//Method with passing parameters  or arguments in()
		System.out.println("Main method started");
		MethodsWithParameters.Addition(45,78);
		Addition(12,32);
		MethodsWithParameters.Multiplication(10, 10.5f);
		Multiplication(11, 5.5f);
		System.out.println();
		
		MethodsWithParameters obj = new MethodsWithParameters();
		obj.Student("Shiv", 10);
		System.out.println("Main method started");	
	}
	
	public static void Addition(int a, int b) {
		int c = a+b;
		System.out.println("Addition of two numbers is : "+c);
	}
	
	public static void Multiplication(int a, float b) {
		float c = a+b;
		System.out.println("Multiplication of two numbers: "+c);
	}
	
	public void Student(String name, int RollNo) {
		System.out.println("Name of student is "+name+" "+"Roll No is "+RollNo);
	}
}
