package Interface;

public class TestCalculator {

	public static void main(String[] args) {
		
		AdvancedCalculator AC = new AdvancedCalculator(); //Static binding
		AC.Addition(); //All methods from calculator interface n casio interface can be accessed.
		AC.Substraction();
		AC.Multiplication();
		System.out.println();
		AC.Log();
		AC.Tan();
		System.out.println();
		AC.Sin();
		AC.Cos();
		System.out.println();
		
		System.out.println("Methods from Calculator interface with dynamic binding ");
		//Creating object of implementation class with reference to Calculator interface
		Calculator C1 = new AdvancedCalculator();
		C1.Addition();
		C1.Substraction();
		C1.Multiplication();
		System.out.println();
		
		System.out.println("Methods from Casio interface with dynamic binding");
		
		Casio C2 = new AdvancedCalculator();
		C2.Log();
		C2.Tan();
	}
}
