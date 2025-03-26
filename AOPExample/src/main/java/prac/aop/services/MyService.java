package prac.aop.services;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	public void doSomething() throws InterruptedException {
		System.out.println("Money is debited from source");
		//
		//
		//
		//
		//
		Thread.sleep(2000);
		//
		//
		//
		//
		//
		System.out.println("Transaction is processing");
		Thread.sleep(2000);
		System.out.println("Transaction is processing");
		//
		//
		//
		//
		//
		Thread.sleep(2000);
		//
		//
		//
		//
		//
		System.out.println("Money is credited at destination");
	}
}
