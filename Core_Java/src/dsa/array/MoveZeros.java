package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
	public static void bruteForce(int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arrayList.add(arr[i]);
			}
		}
		
		int n = arrayList.size();
		for(int i=0; i<n; i++) {
			arr[i] = arrayList.get(i);
		}
		for(int i=n; i<arr.length; i++) {
			arr[i] = 0;
		}
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void optimal(int[] arr) {
		int i=0, j=arr.length-1;
		while(i<j) {
			if(arr[i]==0 && arr[j]!=0) {
				swap(arr, i, j);
				i++;
				j--;
			} else if (arr[i] != 0) {
	            i++;
	        } else if (arr[j] == 0) {
	            j--;
	        }
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//		bruteForce(arr);
		optimal(arr);
	}
}
