package work;

import java.util.Iterator;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Lambda expression with Multithreading");
		
		Runnable runnable1 = () -> {
			// Body of the thread
			for (int i = 0; i < 10; i++) {
				System.out.println("Value of i is " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(runnable1);
		thread.setName("JOHN");
		thread.start();
		
		Runnable runnable2 = () -> {
			// Body of the thread
			for (int i = 0; i <= 10; i++) {
				System.out.println("2 * " + i + " is " + 2*i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread2 = new Thread(runnable2);
		thread2.setName("WICK");
		thread2.start();
		
	}

}
