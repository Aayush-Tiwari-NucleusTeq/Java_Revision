package dsa.array;

import java.util.HashMap;

public class Frequency {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,4,4,4,6,90};
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(!hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], 1);
			} else {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			}
		}
		
		System.out.println(hashMap);
	}
}
