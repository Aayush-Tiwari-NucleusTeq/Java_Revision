package prac.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import prac.aop.services.MyService;

@SpringBootApplication
public class AopExampleApplication {

	public static void main(String[] args) throws InterruptedException {
		
		ConfigurableApplicationContext context = SpringApplication.run(AopExampleApplication.class, args);
		MyService myService = context.getBean(MyService.class);
		myService.doSomething();
		
//		SpringApplication.run(AopExampleApplication.class, args);
//		MyService myService = new MyService();
//		myService.doSomething();
	}

}
