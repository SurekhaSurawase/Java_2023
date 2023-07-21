package Constructor;

public class UseDefinedCons1 {
	//Constructor with parameters
	//Program to store Car Specifications
	
	//NSGV declarations
	String Name;
	String Model;
	int Price;
	String EnginType;
	
	public UseDefinedCons1(String Name1, String Model1, int Price1, String EnginType1) {
		//Variable Initialization;
		Name = Name1;
		Model = Model1;
		Price = Price1;
		EnginType = EnginType1;
		//If we want to use same name of variable and as parameterized variable, this keyword is used.
		
//		this.Name = Name;
//		this.Model = Model;
//		this.Price = Price;
//		this.EnginType = EnginType;
	}
	
	public static void main(String[] args) {
		
		UseDefinedCons1 UD1 = new UseDefinedCons1("Maruti","Scorpio", 1500000, "Manual");
		UseDefinedCons1 UD2 = new UseDefinedCons1("Honda","City", 1200000, "Automatic");
		UseDefinedCons1 UD3 = new UseDefinedCons1("Honda","Ciaz", 1400000, "Manual");

		System.out.println(UD1.Name+" "+UD1.Model+" "+UD1.Price+" "+UD1.EnginType);
		System.out.println(UD2.Name+" "+UD2.Model+" "+UD2.Price+" "+UD2.EnginType);
		System.out.println(UD3.Name+" "+UD3.Model+" "+UD3.Price+" "+UD3.EnginType);
	}
	
}
