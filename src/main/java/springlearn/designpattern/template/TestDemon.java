package springlearn.designpattern.template;


import org.junit.Test;

public class TestDemon {

    @Test
    public void test1() {
        Sister sister = new Sister();
        sister.Life();
        Son son = new Son();
        son.Life();
    }
}
