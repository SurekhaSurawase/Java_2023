package Encapsulation;

public class TestClass {

	public static void main(String[] args) {
		// We can also use private data members i.e encapsulated DM .
		//For that need to create object of that class.
		
		EmployeeData ED = new EmployeeData();
		ED.setAge(27);
		ED.setName("Rekha");
		ED.setEmpID(110);
		
		System.out.println("Employee Name: "+ED.getName());
		System.out.println("Employee Age: "+ED.getAge());
		System.out.println("Employee ID: "+ED.getEmpID());

	}

}
