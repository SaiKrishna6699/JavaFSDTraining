package p10_LinearSearch;

import java.util.*;

public class LinearSearch {
	
	public static int Search(int List[],int ls) {
		int ArrayLength = List.length;
		for(int i=0; i<ArrayLength; i++) {
			if(List[i] == ls) {
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length of array");
		int n = s.nextInt();
		int[] Arr =  new int[n];
		System.out.println("Enter the Elements");
		for(int i=0; i< n; i++) {
			int ele = s.nextInt();
			Arr[i] = ele;
		}
		System.out.println("Enter the element to be searched");
		int ls  = s.nextInt();
		
		int rs = (int)Search(Arr,ls);
		
		if(rs == -1) {
			System.out.println("Element not in the array");
		}
		else {
			System.out.println("Element found at " + rs +" and the search key is " + Arr[rs]);
		}

		s.close();
	}

}
