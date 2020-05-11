package springlearn.designpattern.decorate;

import java.util.List;

public class Decorator2021 extends Decorator {


    public Decorator2021(House house) {
        super(house);
    }

    public void findWife() {
        House2020 house2020 = (House2020) house;
        house2020.getPeoples().add("老婆");
        System.out.println("=========2021lld找到老婆结婚了===========");
    }

    @Override
    public void people() {
        super.people();
        findWife();
    }

    public void addGoods() {
        House2020 house2020 = (House2020) house;
        house2020.getGoods().add("电视机");
        house2020.getGoods().add("电冰箱");
        System.out.println("========2021买了电视机、电冰箱============");
    }

    @Override
    public void goods() {
        //2001年的手电筒还在
        super.goods();
        addGoods();
    }
}
