package springlearn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAnnotation {

    @Pointcut("execution(public * springlearn.service.*.*(..))")
    public void pc1() {

    }

    @Around("pc1()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("==============AspectAnnotation around前置通知=========");
        Object proceed = joinPoint.proceed();
        System.out.println("==============AspectAnnotation around后置通知=========");
        return proceed;
    }
}
