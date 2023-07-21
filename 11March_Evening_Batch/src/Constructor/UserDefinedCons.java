package Constructor;

public class UserDefinedCons {
	
	//Constructor without parameters.
	//1. Variable declaration.
	int Num1; //NSGV
	int Num2;
	
	public UserDefinedCons() {
	
	//2. Variable initialization
		Num1 = 10;
		Num2 = 20;
		int sum = Num1+Num2;
		
	//3. Usage
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		UserDefinedCons UD = new UserDefinedCons();
		UserDefinedCons UD1 = new UserDefinedCons();
		UD.Mult();
		UD1.Mult();
	}
	
	public void Mult() {
		int a =10;
		int b=11;
		int c = a*b;
		System.out.println(c);
	}
}
