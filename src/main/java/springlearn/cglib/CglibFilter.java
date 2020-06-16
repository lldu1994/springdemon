package springlearn.cglib;


import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class CglibFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        String name = method.getName();
        if ("add".equals(name)) {
            return 0;
        } else if ("del".equals(name)) {
            return 1;
        } else if ("query".equals(name)) {
            return 2;
        } else {
            return 0;
        }
    }
}
