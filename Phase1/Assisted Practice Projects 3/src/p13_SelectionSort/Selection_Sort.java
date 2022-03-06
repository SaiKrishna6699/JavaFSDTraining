package p13_SelectionSort;

public class Selection_Sort {
	
	public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }

    }

	
	public static void main(String[] args) {

	    int[] arr = {9,6,3,1,2,4,5};
	    System.out.println("Array Before Sorting");
	    
	    System.out.print("[");
	    for(int i=0; i< arr.length; i++) {
	    	if (i != (arr.length-1)) {
	    		System.out.print(arr[i] + ",");
	    	}
	    	else {
	    		System.out.print(arr[i] + "]\n");
	    	}
	    	
	    }
	    
	    selectionSort(arr);
	    System.out.println("The sorted elements are:");
	    System.out.print("[");
	    for(int i=0; i<arr.length; i++) {
		    	if (i != (arr.length-1)) {
		    		System.out.print(arr[i] + ",");
		    	}
		    	else {
		    		System.out.print(arr[i] + "]\n");
		    	}
		    	
	         }
	     }


}
