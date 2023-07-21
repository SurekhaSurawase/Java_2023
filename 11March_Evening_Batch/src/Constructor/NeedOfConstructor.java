package Constructor;

public class NeedOfConstructor {

	String Name;
	int RollNo;
	
	public NeedOfConstructor() {
		System.out.println("Need of constructor");
	}
	
	public static void main(String[] args) {
		//Store info of 100 students
		NeedOfConstructor S1 = new NeedOfConstructor();
		//NeedOfConstructor S2 = new NeedOfConstructor();
		
		//--
		//NeedOfConstructor S99= new NeedOfConstructor();
		//NeedOfConstructor S100 = new NeedOfConstructor();
		S1.Method1();
		
//		Purpose of Constructor:
//			1. Once we create an object, it is compulsory to initialize that Object.
//			2. Constructor is specially designed to initialize an oject.
//			3. Constructor is a special type of method
//			4. Every time when object is created using new keyword at least one constructor gets called automatically.
	}
	
	public void Method1() {
		Name = "Surekha";
		RollNo = 11;
		System.out.println(Name);
		System.out.println(RollNo);
	}
}
