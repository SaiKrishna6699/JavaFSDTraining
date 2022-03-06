package p14_BubbleSort;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
        int len = arr.length;
        int temp = 0;
        for(int i=0;i<len;i++){
            for (int j=1;j<(len);j++){
                if(arr[j-1]>arr[j]){
                temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;

                }


            }

        }

    }

	
	public static void main(String[] args){

	     int[] arr= {25,20,15,5,10};
	     
	     System.out.println("Array Before Sorting: ");
	     System.out.print("[");
		    for(int i=0; i< arr.length; i++) {
		    	if (i != (arr.length-1)) {
		    		System.out.print(arr[i] + ",");
		    	}
		    	else {
		    		System.out.print(arr[i] + "]\n");
		    	}
		    	
		    }
	     
	     bubbleSort(arr);
	     
	     System.out.println("Sorted Array: ");
	     System.out.print("[");
		    for(int i=0; i< arr.length; i++) {
		    	if (i != (arr.length-1)) {
		    		System.out.print(arr[i] + ",");
		    	}
		    	else {
		    		System.out.print(arr[i] + "]\n");
		    	}
		    	
		    }
	     
	     
	    }


}
