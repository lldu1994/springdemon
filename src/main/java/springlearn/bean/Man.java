package springlearn.bean;

public class Man {

    public static Man  getMan() {
        System.out.println("------创建实例--------");
        return new Man();
    }
}
