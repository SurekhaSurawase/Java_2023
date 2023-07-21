package String;

public class String_methods {

	public static void main(String [] args) {
		//There are 14 methods present in String class.
		//1. charAt() method: It returns character value for the particular or specified index.
		//Syntax: System.out.println(Stringvariablename.charAt(index));
		
		String S1 = "Velocity";
		String S2 = "veloocity";
		
		System.out.println("Index is : "+S1.charAt(3));
		System.out.println("Index is : "+S1.charAt(5));
		System.out.println("Index is : "+S1.charAt(1));
		
		System.out.println(S2.indexOf('o',S2.indexOf('o')+1));
		//System.out.println("Index is : "+S1.charAt(11)); //StringIndexOutOfBoundsException
		
		//System.out.println("Index is : "+S1.charAt(-5));  //StringIndexOutOfBoundsException
		
		//2. length():
		//It returns the size or length of the string
		//Syntax: System.out.println(stringname.length());
		
		System.out.println("Length of the String is: "+S1.length());
		
		//3. .equals() method:
		//Compares content present in respective strings and returns true or false.
		//Syntax: System.out.println(stringname1.equals(stringname2));
		
		System.out.println(S1.equals(S2));
		
		
		//4.isEmpty()
		
		System.out.println(S1.isEmpty());
		
		//5. replace()
		System.out.println(S1.replace('o', 'H'));
		
		//6.relaceAll();
		System.out.println(S1.replaceAll("city", "nation"));
		
		//7. toUpperCase()
		System.out.println(S1.toUpperCase());
		
		//8 toLowerCase()
		String S3 = "ABCD";
		System.out.println(S3.toLowerCase());
		
		//9. trim() : remove starting and ending spaces of string
		String S4 ="    HIII    ";
		System.out.println(S4.trim());
		
		//10.split(): split the whole sentence into words and saves in a string array
		
		String S5 = "Good morning Mumbai";
		String word [] = S5.split(" ");
		for(int i=0; i<word.length ; i++) {
			System.out.print(word[i]);
		}
		System.out.println();
		//11. substring(beginIndex, endIndex)
		
		System.out.println(S5.substring(6,11));
		
	}
}
