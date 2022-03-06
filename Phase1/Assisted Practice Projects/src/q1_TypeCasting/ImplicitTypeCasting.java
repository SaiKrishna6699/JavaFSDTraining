package q1_TypeCasting;

import java.util.Scanner;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Charcter(A-Z or a-z etc single digits) is: ");
		char c = scan.next().charAt(0);
		scan.close();
		
		short s = (short)c;
		
		byte a = (byte)c;
		
		int b = c;
		
		long l = c;
		
		System.out.println("Byte value of " + c + " is: " + a);
		System.out.println("Short value of " + c + " is: " + s);
		System.out.println("Integer value of " + c + " is: " + b);
		System.out.println("Long value of " + c + " is: " + l);
	}
}