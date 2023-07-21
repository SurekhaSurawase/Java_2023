package String;

public class Reverse_String {

	public static void main(String[] args) {

		String Str = "Welcome to java automation";
		System.out.println(Str.lastIndexOf('n'));
		System.out.println();
		
		String reverse = "";
		for (int i=Str.length()-1; i>=0; i--) {
			reverse = reverse + Str.charAt(i) ;	
		}
		System.out.println(reverse);//noitamotua avaj ot emocleW
		
		String [] arr = Str.split(" ");//
		for (int j=arr.length-1; j>=0; j--) {
			System.out.print(arr[j]+" ");//automation java to Welcome 
		}
		
		System.out.println();
		
		
		String Arr1 = Str.substring(0,7);//Welcome
		String reverse1 = "";
		for(int l= Arr1.length()-1; l>=0; l--) {
				reverse1 = reverse1 + Arr1.charAt(l);//emocleW
		}
			
		String Arr2 = Str.substring(8,11);//to
		String reverse2 = "";
		for(int k= Arr2.length()-1; k>=0; k--) {
				reverse2 = reverse2 + Arr2.charAt(k);//ot
		}
		
		String Arr3 = Str.substring(11,16);//java
		String reverse3 = "";
		for(int l= Arr3.length()-1; l>=0; l--) {
				reverse3 = reverse3 + Arr3.charAt(l);//avaj
		}
		
		String Arr4 = Str.substring(16);//automation
		String reverse4 = "";
		for(int m= Arr4.length()-1; m>=0; m--) {
				reverse4 = reverse4 + Arr4.charAt(m);//noitamotua
		}
		System.out.println(reverse1+" "+reverse2+" "+reverse3+" "+reverse4);
			
	}
}
