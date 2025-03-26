package prac.rec.RecursionExample;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
	
//	public static void modifyArr(int[] array) {
//		array[1] = 10;
//	}
	
    public static void main(String[] args) {
        int sum = RecursionMethods.sum(10);
        System.out.println("The sum is " + sum);
        RecursionMethods.printOneToN(1, 30);
        System.out.println();
        RecursionMethods.printNToOne(10, 10);
        System.out.println();
        System.out.println(RecursionMethods.fact(5));
        int[] arr = {1,2,3,4,5};
//        modifyArr(arr);
        
        RecursionMethods.reverseArray(0, arr, 5);
        System.out.println(Arrays.toString(arr));
    }
}
