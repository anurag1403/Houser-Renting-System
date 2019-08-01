package training.sapient.aop.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspect {
	//execution to happen to any package with methods of 'get'
	@Before(value = "execution(public * get*())")
	public void logginBeforeAdvice() {
		System.out.println("Before advise is called...");
	}
}
