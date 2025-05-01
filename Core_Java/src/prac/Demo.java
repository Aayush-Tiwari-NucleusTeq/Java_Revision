package prac;

class A{
	protected void method() {
		System.out.println("Under A");
	}
}

public class Demo {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 0, 12, 0, 9, 0, 7, 0, 3, 0, 8};
//        int n = arr.length;
//        int i = n-1;
//        int j = n-1;
//        for(int no : arr) {
//        	System.out.print(no + " ");
//        }
//        
//        while(i >= 0) {
//        	if(arr[i] != 0 ) {
//        		int temp = arr[i];
//        		arr[i] = arr[j];
//        		arr[j] = temp;
//        		j--;
//        	}
//        	i--;
//        }
//        
//        System.out.println();
//        for(int no : arr) {
//        	System.out.print(no + " ");
//        }
        
    	Integer n = new Integer(50);
    	int n1 = (int)n;
    	System.out.println(n1);
    	A a = new A();
    	a.method();
    }
}
