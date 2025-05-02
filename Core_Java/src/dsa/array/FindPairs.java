package dsa.array;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindPairs {
	public static Set<Entry<Integer, Integer>> bruteForce(int[] arr, int target){
		Set<Map.Entry<Integer, Integer>> set = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					int a = arr[i];
					int b = arr[j];
					set.add(new AbstractMap.SimpleEntry<>(a, b));
				}
			}
		}
		return set;
	}
	
	public static void optimal(int[] arr, int target) {
		int left = 0, right = arr.length-1;
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				System.out.println("The values found at index - " + left +" & "+ right);
				return;
			} else if(sum < target) {
				left++;
			} else right--;
		}
		System.out.println("Sum is not found");
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 6, 5, 8, 11};
		int target = 14;
		Set<Entry<Integer, Integer>> bruteForce = bruteForce(arr, target);
//		System.out.println(bruteForce);
		optimal(arr, target);
	}
}
