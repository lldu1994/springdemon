package springlearn.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Pepole pepole = (Pepole) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{Pepole.class}, new Parent(new XiaoMing()));
        pepole.zhaoduixiang();
        CreateProxyClassFile();
    }

    public static void CreateProxyClassFile() {
        byte[] $Proxies = ProxyGenerator.generateProxyClass("$Proxy", new Class[]{Pepole.class});
        try {
            FileOutputStream fos = new FileOutputStream("$Proxy.class");
            fos.write($Proxies);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
