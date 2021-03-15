package springlearn.bean;

public abstract class ShowSexClass {

    public void showSex(){
        /**
         *  多态的调用方式
         */
        getWomen().showsix();
    }

    //不一定是抽象方法
    public abstract People getWomen();
}
