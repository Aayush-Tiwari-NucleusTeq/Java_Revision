package prac.rec.RecursionExample;

import java.util.Arrays;
import java.util.Collections;

public class RecursionMethods {

	public static int sum(int n) {
		if(n==0) { return 0; }
		return n + sum(n-1);
	}
	
	public static int fact(int n) {
		if(n==0) { return 1; }
		return n * fact(n-1);
	}
	
	public static void printOneToN(int i, int n) {
		if(i>n) {
			return;
		}
		System.out.print(i + " ");
		printOneToN(i+1, n);
	}
	
	public static void printNToOne(int i, int n) {
		if(i<1) {
			return;
		}
		System.out.print(i + " ");
		printNToOne(i-1, n);
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void reverseArray(int i, int[] arr, int n) {
		if(i>=n/2) {
			return;
		}
		swap(arr, i,(n-i-1));
		reverseArray(i+1, arr, n);
	}
}
