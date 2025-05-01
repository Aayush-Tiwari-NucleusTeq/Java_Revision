package dsa.array;

public class Palindrome {

	public static void main(String[] args) {
		int[] arr = {1,0,2,3,4,3,2,0,1};
		int i=0, j=arr.length-1;
		boolean flag=true;
		while(i<j) {
			if(arr[i] == arr[j]) {
				i++;
				j--;
				flag=true;
			} else {
				flag=false;
				break;
			}
		}
		
		System.out.println(flag==true ? "Array is palindrome" : "Array is not palindrome");

	}

}
