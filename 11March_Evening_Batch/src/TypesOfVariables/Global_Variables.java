package TypesOfVariables;

public class Global_Variables {

	//Non- static Global variables call from same class
	int number = 500; //Non-static Global Variables
	String name = "Shivendra";
	public static void main(String[] args) {
		//Global Variables: The variables declared outside the method body and inside the class is called Global Variables.
		Global_Variables NGV = new Global_Variables(); //Object creation to call non-static regular method.
		NGV.M1();
	}
	
	public void M1()
	{
		
		System.out.println(number);
		number = 1000;
		System.out.println(number);
		int i=100;
		int Addition = number+i;
		System.out.println(Addition);

	}
}
