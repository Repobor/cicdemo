package top.repobor.service;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CounterTest {
    private Counter counter;

    @BeforeMethod
    public void beforeMethod() {
        counter = new CounterImpl();
    }

    @Test
    void increase() {
        counter.increase();
        assert counter.get() == 1;
    }

    @Test
    void decrease() {
        counter.decrease();
        assert counter.get() == -1;
    }

    @Test
    void get() {
        counter.increase();
        assert counter.get() == 1;
    }

    @Test
    void set() {
        counter.set(100);
        assert counter.get() == 100;
    }
}