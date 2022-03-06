package p11_BinarySearch;

import java.util.Scanner;

public class BSearch {
	
	public static void binarySearch(int[] arr, int start, int key, int length){

        int midValue = (start+length)/2;
        while(start<=length){

            if(arr[midValue]<key){

                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
            if(start>length){

                System.out.println("Element is not found");
            }

	}
	
	public static  void main(String[] args){


		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length of array");
		int n = s.nextInt();
		int[] Arr =  new int[n];
		System.out.println("Enter the Elements");
		for(int i=0; i< n; i++) {
			int ele = s.nextInt();
			Arr[i] = ele;
		}
		System.out.println("Enter the key Value: ");
        int key = s.nextInt();
        int arrlength = Arr.length;
        binarySearch(Arr,0,key,arrlength);
    }

}