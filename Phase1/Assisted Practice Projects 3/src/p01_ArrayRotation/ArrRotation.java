package p01_ArrayRotation;

public class ArrRotation {
	public void rotate(int[] n, int k) {
		if(k > n.length) {
			k=k%n.length;
		}
		int[] rs = new int[n.length];
		
		for (int i=0; i<k; i++) {
			rs[i] = n[n.length-k+i];
		}
		int j=0;
		for(int i=k; i<n.length; i++) {
			rs[i]= n[j];
			j++;
		}
		System.arraycopy(rs, 0, n, 0, n.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrRotation r = new ArrRotation();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		r.rotate(arr, 5);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
