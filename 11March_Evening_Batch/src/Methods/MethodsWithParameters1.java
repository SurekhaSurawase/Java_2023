package Methods;

public class MethodsWithParameters1 {

	public static void main(String[] args) {
		//Method with multiple parameters
		System.out.println("Main method started");
		
		MethodsWithParameters1.StudentInfo("Shiv",9, 'A', 95.55f);
		MethodsWithParameters1.StudentInfo("vaibhav",10, 'A', 80.58f);
		System.out.println();
		
		MethodsWithParameters1 obj = new MethodsWithParameters1();//Object creation for method sum
		
		obj.sum(45,796,100);
		obj.sum(52,120,1450);
		System.out.println("Main method started");

		
	}
	
	public void sum(int a, int b, int c) {
		int Addition = a+b+c;
		System.out.println("Addition is: "+Addition);
	}
	
	public static void StudentInfo(String name, int RollNo, char Grade, float Percentage) {
		System.out.println("Name of student: "+name+" ,"+"Roll No is: "+RollNo+" ,"+"Grade of Student is: "+Grade
				+" ,"+"Percentage is : "+Percentage);
	}
}
