package TypesOfVariables;

public class Local_variables {

	public static void main(String[] args) {
		//Types of Variables: 2 types, Local Variables and Global Variables
		
		/*Local Variables: Variable declared inside the method is called local variable.
		//Local variables are only non-static in nature.
		Scope of the variable is only inside the method body.*/
		
		//static int Per;//not allowed
		//We can not declare static variable inside Main method body are any other kind of methods of the class

		Local_variables.M1();//Calling by class name
	}
	
	public static void M1() {
		
		int RollNo=10; //Non-static Local variable
		String name = "Shivendra";
		System.out.println(name);
		System.out.println(RollNo);
	}
}
