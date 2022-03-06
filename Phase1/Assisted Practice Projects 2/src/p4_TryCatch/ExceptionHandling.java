package p4_TryCatch;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[7];
		try {
			arr[9] = 23;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds!\n");
		}
		finally {
			System.out.println("The array is of size is: " + arr.length);
		}

	}

}