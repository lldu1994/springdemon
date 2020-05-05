package springlearn.designpattern.template;

/**
 * 通过子类继承父类，重而实现父类里面的钩子方法来干预父类的业务流程
 */

public abstract class Father {

    public void Life() {
        learn();
        work();
        Love();
    }

    public void learn() {
        System.out.println("学习");
    }

    public void work() {
        System.out.println("工作");
    }

    //钩子方法
    public abstract void Love();

}
