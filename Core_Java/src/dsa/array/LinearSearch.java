package dsa.array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,50,6,6,7};
		int n = 500;
		int index=-1;
		for(int i=0; i<arr.length; i++) {
			if(n==arr[i]) {
				index = i;
				break;
			} 
		}
		System.out.println(index != -1 ? "Element found at index: " + index : "Element not found.");
		System.out.println("End of the program");
	}

}
