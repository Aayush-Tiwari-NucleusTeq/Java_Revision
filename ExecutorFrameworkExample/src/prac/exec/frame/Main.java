package prac.exec.frame;

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
	
}

public class Main {
	
	

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new MyThread());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			thread.start();
		}

	}

}
