package prac.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
//	@Pointcut("execution(public void prac.aop.services.*.*(..))")
//	public void allServiceMethods() {}

	@Before("execution(* prac.aop.services.MyService.doSomething(..))")
	public void printBefore() {
		System.out.println("Transaction is started with aspect class");
	}
	
	@After("execution(* prac.aop.services.MyService.doSomething(..))")
	public void printAfter() {
		System.out.println("Transaction is completed with aspect class");
	}
}
