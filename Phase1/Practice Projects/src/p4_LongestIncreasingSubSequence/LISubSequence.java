package p4_LongestIncreasingSubSequence;

import java.util.*;

public class LISubSequence {
	
	static int Incre_SubSequence(int Arr[], int Arr_Length)
	{
		int Seq_Arr[] = new int[Arr_Length];
		int i, j, LIS = 0;
		
		
		/* Initialize LIST values for all indexes */
		for (i = 0; i < Arr_Length; i++) {
			Seq_Arr[i] = 1;
		}
		
		

		/* Compute optimized LIS values in bottom up manner */
		for (i = 1; i < Arr_Length; i++) {
			for (j = 0; j < i; j++) {
				if (Arr[i] > Arr[j] && Seq_Arr[i] < Seq_Arr[j] + 1) {
					Seq_Arr[i] = Seq_Arr[j] + 1;
				}
			}
		}

		/* Pick maximum of all LIS values */
		for (i = 0; i < Arr_Length; i++) {
			if (LIS < Seq_Arr[i]) {
				LIS = Seq_Arr[i];
			}
		}

		return LIS;
		
		
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int Arr_length = s.nextInt();
		int Arr[] = new int[Arr_length];
		
		for (int i = 0; i < Arr_length; i++) {
			int ele = s.nextInt();
			Arr[i] = ele;
		}
		
		System.out.println("Printing Elements in the Array \n");
		
		System.out.print("[");
		for (int i = 0; i < Arr_length; i++) {
			System.out.print(Arr[i]);
			if (i != (Arr_length-1)) {
			System.out.print(", ");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println("\n");
		
		System.out.println("Length of Longest Increment Sub Sequence is " + Incre_SubSequence(Arr, Arr_length) + "\n");
	}
}