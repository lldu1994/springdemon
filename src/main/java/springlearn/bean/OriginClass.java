package springlearn.bean;

import java.util.List;

/**
 *   这个方法需要进行业务功能增强，但是又不希望再原来的基础上修改，可以用
 *   replaced- method 标签
 */
public class OriginClass {

    public void method(String param){
        System.out.println("I am origin method! param ="+param);
    }

    public void method(List param){
        System.out.println("I am origin method! param ="+param);
    }
}
