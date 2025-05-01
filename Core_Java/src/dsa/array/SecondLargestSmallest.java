package dsa.array;

import java.util.Arrays;

public class SecondLargestSmallest {
	public static void main(String[] args) {
		int[] arr = {10,1,5,70,5,14,1,0};
		Arrays.sort(arr);
		System.out.println("Second largest - " + arr[1] + " Second smallest - " + arr[arr.length - 2]);
	}
}
