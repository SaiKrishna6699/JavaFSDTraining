package P1_ArithematicCalculator;

import java.util.*;

//Using Inheritance to access the Protected methods
public class Calculator extends Calci{
	
	//Private Addition and Subtraction methods
	private float addition(float a, float b){
		return a + b;
	}
	//Static Private Class
	private float subtraction(float a, float b){
		return a - b;
	}
	
	public static void main(String[] args) {
		//Calling method using Object
		Calculator myCal = new Calculator();
		// Calling Protected method using Object
		Calci mycal1 = new Calci();
		
		// Do While loop for Repeating Calculation
		char ch;
		do {
			
		// Using Scanner for taking input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number: \n");
		float x = s.nextFloat();
		
		System.out.println("Enter the Second Number: \n");
		float y = s.nextFloat();
		
		System.out.println("Enter the operator: \n");
		char operator = s.next().charAt(0);
		
		
		double result = 0;
		
		//Using Switch case for calculationg
		switch (operator) {
		
		case '+':
			result = myCal.addition(x, y);
			break;
			
		case '-':
			result = myCal.subtraction(x, y);
			break;
			
		
		case '*':
			result = mycal1.multiplication(x, y);
			break;
			
		case '/':
			// if else statement For Zero Division 
			if (y != 0) {
			result = mycal1.division(x, y);
			break;}
			else {
				System.out.println("Cannot be divisible by zero.");
			}
		// Default for wrong input	
		default:
			System.out.println("Entered Wrong Input!");
			break;
		
		}

		// Making the result as Final and Widening / Implicit Type casting result from double to float
		final double result1 = (double)result;
		
		// Printing Result
		// Narrow Type casted x and y to integer from float
		int m = (int)x ;
		int n = (int)y;
		System.out.println(m + " " + operator + " " + n + " = " + result1);
		
		System.out.println();
		System.out.println("Enter the Y to retry and N to exit");
		ch = s.next().charAt(0);
		
		
		
		}while(ch == 'Y');
		// Do While Ending
		
		if (ch == 'N') {
			System.out.println("Exited");
		}
		
		else {
			System.out.println("Invalid Input!");
			System.out.println("Input should be either Y or N");
		}
	
	}
}

/*
 *  Program by Rajagopal Sai Krishna
 *  Git Id SaiKrishna6699
 *  
 * 
 */