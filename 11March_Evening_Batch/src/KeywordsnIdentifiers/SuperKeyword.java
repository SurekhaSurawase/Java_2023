package KeywordsnIdentifiers;

public class SuperKeyword extends Sample1{

	int RollNo = 10;
	String Name = "Surekha";
	public static void main(String[] args) {
		SuperKeyword obj = new SuperKeyword();
		obj.StudentInfo();
	}
	
	public void StudentInfo() {
		int RollNo = 9;
		String Name = "Vaibhav";
		System.out.println(RollNo);
		System.out.println(Name);
		System.out.println();
		System.out.println(this.RollNo);
		System.out.println(this.Name);
		System.out.println();
		System.out.println(super.Name);
		System.out.println(super.RollNo);
	}
}
