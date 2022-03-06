package q1_TypeCasting;

import java.util.Scanner;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Double Value \n");
			double d = s.nextDouble();
			s.close();
			System.out.println("Value of Double is: " + d);
			
			long l = (long)d;
			
			int i = (int)l;
			
			char c = (char)d;
			
			System.out.println("Long value of "+ d + "is: " + l);
			System.out.println("Integer value of "+ d + "is: " + i);
			System.out.println("Character value of "+ d + "is: " + c);

	}

}

