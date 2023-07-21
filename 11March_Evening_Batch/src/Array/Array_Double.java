package Array;

public class Array_Double {

	public static void main(String [] args) {
		//double type of data
		//Syntax: double arrayname [] = new double[size of array];
		
		double [] D1 = new double[4]; //saves float type data with more value
		
		D1[0] = 45d;
		D1[1] = 78.79;
		D1[3]= 13647697;
		
		System.out.println(D1[2]); //0.0; because we have not assigned any value for the same
		
		System.out.println(D1.length);
		for(int i=0; i<4; i++) {
			System.out.println(D1[i]);
		}
		
	}
}
