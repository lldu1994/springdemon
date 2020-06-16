package springlearn.proxy;

public class XiaoMing implements Pepole {

    //在小明双手没有解放之前，小明得父母要帮助小明找对象
    @Override
    public void zhaoduixiang() {
        System.out.println("我在北京工作，没有时间找对象，双手一直得不到解放");
    }

    //如果小明得父母帮助小明找到了对象，小明可以解放双手，结婚生小孩
}
