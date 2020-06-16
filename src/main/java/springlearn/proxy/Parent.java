package springlearn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 这个是一个增强类，是对目标对象得一个方法增强
 */
public class Parent implements InvocationHandler {

    //必须持有目标对象得引用
    private Pepole pepole;

    public Parent(Pepole pepole) {
        this.pepole = pepole;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        before();
        method.invoke(pepole, objects);
        after();
        return null;
    }

    public void before() {
        System.out.println("方法调用之前");
    }

    public void after() {
        System.out.println("方法调用之后");
    }
}
