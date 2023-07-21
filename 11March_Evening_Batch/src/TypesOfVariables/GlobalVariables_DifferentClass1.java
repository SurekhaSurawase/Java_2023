package TypesOfVariables;

public class GlobalVariables_DifferentClass1 {

	public static void main(String[] args) {
		//Syntax: SGV from different class
		//System.out.println(classname.variablename);
		
		System.out.println(Global_Variables_FromDifferentClass.FirstName);
		System.out.println(Global_Variables_FromDifferentClass.RollNo);
		
		//Syntax: NSGV from different class
		//Here object creation is required.
		//System.out.println(ReferenceVaiableName.NonStaticGlobalVariableName);
		Global_Variables_FromDifferentClass obj = new Global_Variables_FromDifferentClass();
		System.out.println(obj.name);
		System.out.println(obj.number);
	}
}
