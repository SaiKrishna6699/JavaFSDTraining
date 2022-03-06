package p5_KeyWordsandCustomExceptions;

import java.util.*;

public class ExceptionHandling {
	public static void main(String[] args)
    {	
		Scanner sc = new Scanner(System.in);

        int x=0,y=0;
        double result;
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        try
        {
            if(y==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                result = x / y;
                System.out.print("\nThe result is : " + result);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
    }
}


