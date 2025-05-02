package dsa.array;

public class KadanesAlgo {
	
	public static int bruteForce(int[] arr) {
		int maxele = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k < j; k++) {
					sum += arr[k];
				}
				maxele = Math.max(maxele, sum);
			}
		}
		
		return maxele;
	}
	
	public static int better(int[] arr) {
		int maxele = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
					sum += arr[j];
					maxele = Math.max(maxele, sum);
			}
		}
		
		return maxele;
	}
	
	public static int optimal(int[] arr) {
		int maxele = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
			if(sum > maxele) {
				maxele = sum;
			}
			
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxele;
	}

	public static void main(String[] args) {
		int[] arr = {-1,-9, 1, 2, 3, 4};
//		int bruteForce = bruteForce(arr);
//		int better = better(arr);
		int optimal = optimal(arr);
		System.out.println("The maximum sum from the array is - " + optimal);
	}
}
