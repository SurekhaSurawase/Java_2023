package TypesOfVariables;

public class Global_Variables1 {

	static int RollNo= 11;
	static String name= "Vaibhav";
	
	public static void main(String[] args) {
		//Static global variables call from same class
		Global_Variables1 SGV = new Global_Variables1();
		SGV.M2();
	}
	
	public void M2() {
		System.out.println(RollNo);
		RollNo = 13;
		System.out.println(RollNo);
	}
	
}
