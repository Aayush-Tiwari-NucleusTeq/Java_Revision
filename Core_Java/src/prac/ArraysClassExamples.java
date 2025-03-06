package prac;

import java.util.Arrays;

public class ArraysClassExamples {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int index = Arrays.binarySearch(num, 5);
		System.out.println("The number 5 is present at " + index);
		
		int[] num2 = {23, 5, 89, 1, 45, 12, 67, 34, 9, 78};
		Arrays.sort(num2);
		System.out.println(Arrays.toString(num2));

		Arrays.fill(num, 11);
		System.out.println(Arrays.toString(num));
	}
}
