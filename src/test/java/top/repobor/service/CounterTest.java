package top.repobor.service;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


class CounterTest {
    private final Counter counter = new CounterImpl();

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
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