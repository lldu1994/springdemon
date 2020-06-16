package springlearn.cglib;

public class Test {
    public static void main(String[] args) {
        TargetClass targetClass = (TargetClass) CglibInstanceFactory.getInstance();
        targetClass.add();
    }
}
