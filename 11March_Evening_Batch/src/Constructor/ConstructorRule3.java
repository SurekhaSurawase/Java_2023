package Constructor;

public class ConstructorRule3 {

	//Return type is not allowed for constructor even void also.
	
//	public void ConstructorRule3() {//not allowed as return type
//		
//	}
	
	public static void main(String[] args) {
		//If void keyword is used while declaring constructor, compiler will consider as method.
		
		//ConstructorRule3 R3= new ConstructorRule3();
	}
	
	public ConstructorRule3() {
		System.out.println("Rule3");
	}
}
