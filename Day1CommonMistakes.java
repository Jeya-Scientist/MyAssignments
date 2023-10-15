package week1.day1;

public class Day1CommonMistakes {
public static void main(String[] args) {
	
	byte b = 127; //1 byte Stores whole numbers between 2^8 -128 to 127
	short sh=32767;  //2 bytes Stores whole numbers between 2^16/2 65536/2 ..includes 0.. -32,768 to 32,767
	int i= 2147483647;//4 bytes 4294967296/2 2,14,74,83,648 to 2,14,74,83,647
	long l=9223372036854775807L;  //8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	float f = 99.9956f; //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	double d =99.9999999999344; //Stores fractional numbers. Sufficient for storing 15 decimal digits
	char c='J';
	String s="Variable Names";
	boolean bo=true;
	System.out.println("**********MY VARIABLES BEG*****************");
	System.out.println("My Byte variable is: " + b);
	System.out.println("My Short variable is: " + sh);
	System.out.println("My Int variable is: " + i);
	System.out.println("My Long variable is: " + l);
	System.out.println("My Float variable is: " + f);
	System.out.println("My Double variable is: " + d);
	System.out.println("My Char variable is: " + c);
	System.out.println("My String variable is: " + s);
	System.out.println("My Boolean variable is: " + bo);
	System.out.println("**********MY VARIABLES END*****************");
	//declare variable without datatypes
	//a=6;
	//print variable with double quotes
	System.out.println("My Boolean variable is: " + "bo");

}
}
