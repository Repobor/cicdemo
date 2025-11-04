package top.repobor.service;

public class CounterImpl implements Counter {

    private final ThreadLocal<Integer> counter = new ThreadLocal<>();

    CounterImpl() {
        counter.set(0);
    }


    @Override
    public void increase() {
        counter.set(counter.get() + 1);
    }

    @Override
    public void decrease() {
        counter.set(counter.get() - 1);
    }

    @Override
    public Integer get() {
        return counter.get();
    }

    public void set(Integer value) {
        counter.set(value);
    }
}
