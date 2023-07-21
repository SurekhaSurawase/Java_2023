package Constructor;

public class DefaultConstructor2 {

//	Default Constructor:
//	Syntax:
//	public DefaultConstructor2() {
//		super();
//	}
	
//	Rules:
//	1. It is always of zero input parameter or arguments.
//	2. Access modifiers of default constructor is same as that of the class modifier.
//	3. It always contain only one line of code i.e. super(); class/keyword.
//	4. Default constructor is used to provide default values to the object. ex: null, 0, false
	
	public static void main(String[] args) {
		DefaultConstructor2 D2 = new DefaultConstructor2();
		DefaultConstructor2 D3 = new DefaultConstructor2();
		D3.M1();
		D2.Addition();
	}
	
	public void M1() {
		System.out.println("Hi");
	}
	
	public void Addition() {
		int i=10;
		int j=20;
		int k= i+j;
		System.out.println(k);
	}
}
