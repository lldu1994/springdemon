package springlearn.bean;

public class Women implements People{

    public void initMethod(){
        System.out.println("-------initMethod----");
    }

    public void destroyMethod(){
        System.out.println("-------destroyMethod----");
    }

    public void getwomen(){
        System.out.println("--------lookup---------");
    }


    @Override
    public void showsix() {
            System.out.println("i am woman");
    }
}
