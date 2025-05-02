package dsa.array;

public class MergeSorted {
	
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] arr3 = new int[n+m];
		int left = 0;
		int right = 0;
		int index = 0;
		
		while(left < n && right < m) {
			if(arr1[left] <= arr2[right]) {
				arr3[index] = arr1[left];
				left++;
				index++;
			} else {
				arr3[index] = arr2[right];
				right++;
				index++;
			}
		}
		
		while(left < n) {
			arr3[index++] = arr1[left++];
		}
		
		while(right < m) {
			arr3[index++] = arr2[right++];
		}
		
		return arr3;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,4,8,10,11,12};
		int[] arr2 = {2,3,9,11};
		int[] mergeSortedArrays = mergeSortedArrays(arr1, arr2);
		for(int i: mergeSortedArrays) {
			System.out.print(i + " ");
		}
	}

}
