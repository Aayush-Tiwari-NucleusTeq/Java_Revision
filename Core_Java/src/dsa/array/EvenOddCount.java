package dsa.array;

public class EvenOddCount {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,5,6,6,7,8,10};
		int odd_cnt=0, even_cnt=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even_cnt++;
			} else {
				odd_cnt++;
			}
		}
		
		System.out.println("Odd count - " + odd_cnt + " Even count - " + even_cnt);

	}

}
