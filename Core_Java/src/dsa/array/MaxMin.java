package dsa.array;

public class MaxMin {

	public static void main(String[] args) {
		int[] arr = {100, 0, 3, 4, 5, 1};
		int arr2[] = new int[5];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] <min ) {
				min = arr[i];
			}
		}
		
		System.out.println("Max = " + max + " Min = " + min);
	}

}
