package DataTypes;

public class NumericalAndDecimal {

	public static void main(String[] args) {
		//DataTypes specifies size of memory.
		//Mainly two types: /primitive and non-primitive data types.
		//Primitive DataTypes: Size is fixed. divided into 8 types further.
		
		//1. Byte: size is 1-byte or 8-bit
		//Syntax: byte i= value;
		byte i=45; 
		byte j= 127; //Maximum range
		byte k = -128;//minimum range
		
		System.out.println("Byte Data Type: "+i);
		System.out.println("Byte DataType Max vaue: "+j);
		System.out.println("Byte DataType Min value: "+k);
		System.out.println();
		
		//2. Short: size is 2 bytei.e 16 bit
		//Syntax: short i=value;
		short a = 31257;
		short b= -32768;
		short c= 32767;
		System.out.println("Short data type: "+a);
		System.out.println("Short Data Type Min value: "+b);
		System.out.println("Short Data type Max value: "+c);
		System.out.println();
		//3. Integer Data type: Size is 4 byte i.e. 32 bit
		//Syntax: int RollNo = 11;
		
		int Number = 45;
		int Max = 2147483647;
		int min = -2147483648;
		System.out.println("Integer Data Type: "+Number);
		System.out.println("Integer Data Type Max value: "+Max);
		System.out.println("Integer Data Type Min value: "+min);
		System.out.println();
		
		//4. Long Data type: size is 8 byte i.e 64 bit. Long data type is used when size of value exceeds integer limit.
		//Syntax: long m = 45; l should be entered at end of value.
		
		long n = 54664121546l;
		System.out.println("Long Data Type: "+n);
		
		
		
	}
}
