package springlearn.cglib;

/**
 * 这里不实现接口
 */
public class TargetClass {

    public void  add(){
        System.out.println("TargetClass.add");
    }
    public void  del(){
        System.out.println("TargetClass.del");
    }
    public void  query(){
        System.out.println("TargetClass.query");
    }

}
