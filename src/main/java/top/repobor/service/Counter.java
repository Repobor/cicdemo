package top.repobor.service;

public interface Counter {
    void increase();
    void decrease();
    Integer get();
    void set(Integer value);
}
