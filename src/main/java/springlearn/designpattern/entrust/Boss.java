package springlearn.designpattern.entrust;

public class Boss implements Company {
    Sum sum = new Sum();

    @Override
    public void product() {
        /**
         *  Boss 委托sum公司去生产东西
         */
        sum.product();
    }
}
