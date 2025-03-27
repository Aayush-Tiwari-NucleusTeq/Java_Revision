package prac.exec.frame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadExe implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
	
}

public class FixedThreadPoolExample {

	public static void main(String[] args) {
		
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for(int i=0; i<10; i++) {
			threadPool.submit(new MyThreadExe());
		}
		
		threadPool.shutdown();
		
	}
}
