package Encapsulation;

public class EmployeeData {

	private int EmpID = 100;
	private String name = "Surekha";
	private int Age = 30;
	
	public static void main(String[] args) {
		//Encapsulationis wrapping of data with code into single unit

		//As the variables are declared as private so to access them we need to create object of class and setter and getter method.
		EmployeeData ED = new EmployeeData();
		ED.setAge(25);
		ED.setName("Jaya");
		ED.setEmpID(102);
		
		System.out.println("Employee Name: "+ED.getName());
		System.out.println("Employee Age: "+ED.getAge());
		System.out.println("Employee ID: "+ED.getEmpID());
		
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int EmpID) {
		this.EmpID = EmpID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	
}
