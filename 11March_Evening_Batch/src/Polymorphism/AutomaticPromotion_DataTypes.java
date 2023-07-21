package Polymorphism;

public class AutomaticPromotion_DataTypes {

	//Automatic Promotion: Here Small sized Data types are promoted to larger size data types if no match is found.
	//byte-->short-->int-->long-->float-->double
	//char-->int-->long-->float-->double
	
	public static void main(String[] args) {
		AutomaticPromotion_DataTypes D1 = new AutomaticPromotion_DataTypes();
		D1.demo1();
		D1.demo1(10);
		D1.demo1(45l);
		D1.demo1('A');
		D1.demo1(4);
	}
	
	public void demo1() {
		System.out.println("Zero input parameter");
	}
	
	public void demo1(int i) {
		System.out.println("int input parameter");
	}
	
	public void demo1(char a) {
		System.out.println("Char input parameter");
	}
	
	public void demo1(long c) {
		System.out.println("Long input parameter");
	}
	
}
