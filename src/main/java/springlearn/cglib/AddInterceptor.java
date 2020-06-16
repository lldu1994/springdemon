package springlearn.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


//这个是对add方法得一个拦截器
public class AddInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("add调用前");
        methodProxy.invoke(o,objects);
        System.out.println("add调用后");
        return null;
    }
}
