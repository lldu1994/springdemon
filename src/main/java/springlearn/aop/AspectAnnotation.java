package springlearn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import springlearn.annotation.ReturnValue;
import springlearn.annotation.TargetMethod;
import springlearn.annotation.ThrowsAnno;

@Component
@Aspect
public class AspectAnnotation {

    @Pointcut("execution(public * springlearn.service.*.*(..))")
    public void pc1() {

    }

    @Pointcut("execution(public * springlearn.service.*.add*(..))")
    public void pc2() {

    }

    @Around("pc1()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("==============AspectAnnotation around前置通知=========");
        Object proceed = joinPoint.proceed();
        System.out.println("==============AspectAnnotation around后置通知=========");
        return proceed;
    }

    @Before("pc2()")
    public void before() throws Throwable {
        System.out.println("==============AspectAnnotation around前置通知add=========");
    }

    @Before(value = "@annotation(targetMethod)")
    public void xx(JoinPoint joinPoint, TargetMethod targetMethod) throws Throwable {
        System.out.println("=======注解拦截 前置通知========");
        System.out.println("============targetMethod.name=====" + targetMethod.name());
    }

    @AfterReturning(value = "@annotation(returnValue)",returning = "retValue")
    public void afterReturning(JoinPoint joinPoint, ReturnValue returnValue,Object retValue) throws Throwable {
        System.out.println("=======注解拦截 后置通知========");
        System.out.println("============targetMethod.name=====" + returnValue.value()+"==="+retValue);

    }

    @AfterThrowing(value = "@annotation(throwsAnno)",throwing = "e")
    public void throwMethod(JoinPoint joinPoint, ThrowsAnno throwsAnno,Throwable e ) throws Throwable {
     System.out.println("=============AspectAnnotation 异常通知 异常====="+e);
    }
}
