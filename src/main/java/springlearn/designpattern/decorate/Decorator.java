package springlearn.designpattern.decorate;

import lombok.Data;

/**
 * 装饰着类，是对房子的装饰，所有需要实现house接口
 * <p>
 * 装饰者规定了装饰流程，就是规定了接口调用过程，具体子类实例方法如何调用字类去实现
 */
@Data
public abstract class Decorator implements House {

    public House house;

    public Decorator(House house) {
        this.house = house;
    }

    public void people() {
        house.people();
    }

    public void goods() {
        house.goods();
    }

}
