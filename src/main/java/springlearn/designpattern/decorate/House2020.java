package springlearn.designpattern.decorate;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class House2020 implements House {

    public List<String> peoples = new ArrayList<>();
    public List<String> goods = new ArrayList<>();

    @Override
    public void people() {
        peoples.add("老爸");
        peoples.add("老妈");
        peoples.add("lld");
        System.out.println("=======2020年lld家里只有老爸，老妈和lld=========");
    }

    @Override
    public void goods() {
        goods.add("手电筒");
        System.out.println("=======2020年lld家里只有一个手电筒=========");
    }
}
