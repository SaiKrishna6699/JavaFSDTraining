package q9_Array;

import java.util.Scanner;

public class MultiDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		int[][] mArr = new int[m][n];
		
		for (int i=0 ; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.println("Enter the element in Index: " + i + "" + j);
				mArr[i][j] = s.nextInt();
				
			}
		}
		
		System.out.println("Printing Elements in Array");
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
			System.out.println(mArr[i][j]);
		}

	}
		System.out.println("\nLength of row 1: " + mArr[0].length);

}

}