package KeywordsnIdentifiers;

public class ThisAndSuperKeywords {

	int Number = 100;
	String Name = "Shiv";
	//This Keyword: It is used to access global variables having same name as local variables within same class
	public static void main(String[] args) {
		
		ThisAndSuperKeywords obj = new ThisAndSuperKeywords();
		obj.Demo();
	}
	
	public void Demo() {
		int Number = 10;
		String Name = "Surekha";
		System.out.println(Number);
		System.out.println(Name);
		
		System.out.println();
		System.out.println(this.Number);
		System.out.println(this.Name);
	}
}
