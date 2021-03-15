package springlearn.bean;

public class FactoryBean {
    public  Man getMan() {
        System.out.println("------创建实例--------");
        return new Man();
    }
}
