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

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//		int bruteForce = bruteForce(arr);
		int better = better(arr);
		System.out.println("The maximum sum from the array is - " + better);
	}
}
