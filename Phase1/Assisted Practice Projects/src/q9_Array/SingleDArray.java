package q9_Array;

import java.util.Scanner;

public class SingleDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the Elemets into array");
		for (int i=0; i<n; i++) {
			System.out.println("Enter the element in Index: " + i);
			a[i] = s.nextInt();
		}
		System.out.println("Printing Elements in Array");
		for (int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
		
		s.close();
	}
}
