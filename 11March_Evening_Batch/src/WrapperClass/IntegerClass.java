package WrapperClass;

public class IntegerClass {

	public static void main(String[] args) {
	 // Wrapper class is a predefine class of java which convert primitive data types into objects.

		String S1 = "200";
		String S2 = "400";
		System.out.println("without data type conversion: "+S1+S2);//200400 but we want 600 as a ans
		//so this we need to convert string data type into integer. this is possible using Wrapper class an parse() method.
		
		int value1 = Integer.parseInt(S1);
		int value2 = Integer.parseInt(S2);
	
		System.out.println("Using wrapper class: "+value1+value2);
	}

}
