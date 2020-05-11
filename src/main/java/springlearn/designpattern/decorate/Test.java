package springlearn.designpattern.decorate;

public class Test {
    public static void main(String[] args) {
        House house = new House2020();
        System.out.println("=======2020情况=========");
        house.people();
        house.goods();
        System.out.println("=======2021情况=========");
        House house1 = new Decorator2021(house);
        house1.people();
        house1.goods();
    }
}
