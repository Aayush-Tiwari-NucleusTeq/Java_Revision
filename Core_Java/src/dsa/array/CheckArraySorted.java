package dsa.array;

public class CheckArraySorted {
	public static boolean ascCheck(int arr[]) {
		boolean sorted = false;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				sorted = false;
				return sorted;
			} 
		}
		return true;
	}
	public static boolean descCheck(int arr[]) {
		boolean sorted = false;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				sorted = false;
				return sorted;
			} 
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr= {1000,2,3,4,5, 200};
		boolean sorted = false;
		sorted = descCheck(arr);
		System.out.println(sorted == true ? "Array is sorted" : "Array is not sorted");
	}
}
