package springlearn.cglib;


import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

public class CglibInstanceFactory {


    public static Object getInstance() {
        //拿到字节码增强器
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetClass.class);
        enhancer.setCallbackFilter(new CglibFilter());
        Callback[] callbacks = {
                new AddInterceptor(),
                new DelInterceptor(),
                new queryInterceptor()
        };
        enhancer.setCallbacks(callbacks);
       return enhancer.create();

    }
}
