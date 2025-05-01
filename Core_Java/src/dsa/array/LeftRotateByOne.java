package dsa.array;

public class LeftRotateByOne {
	public static void bruteForce(int[] arr) {
		int[] temp = new int[arr.length];
		int j=0;
		for(int i=1; i<arr.length; i++) {
			temp[j] = arr[i];
			j++;
		}
		temp[j] = arr[0];
		for(int i: temp) {
			System.out.print(i + " ");
		}
	}
	
	public static void optimal(int[] arr) {
		int x = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = x;
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {11,2,3,4,5,6};
//		bruteForce(arr);
		optimal(arr);
	}
}
