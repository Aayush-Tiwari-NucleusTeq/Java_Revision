package dsa.array;

import java.util.Arrays;

public class RemoveDuplicateSorted {
	public static void main(String[] args) {
		int[] arr = { 10, 25, 25, 45, 23, 3, 5, 90 };
		System.out.println(arr.length);
		Arrays.sort(arr);
		int j = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}
}
