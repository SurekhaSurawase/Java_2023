package TypesOfVariables;

public class Practice {

	static int i = 10;
	int j= 3;
	
	public static void main(String[] args) {
		int i = 20;
		System.out.println(Practice.i);//10
		System.out.println(i); //20
		
		Practice  obj = new Practice();
		
		System.out.println(obj.j);//3
		
	}
	
	public void Demo1() {
		int i= 20;
		System.out.println(i);
		
		System.out.println(Practice.i);
		System.out.println(j);
	}
	
}
