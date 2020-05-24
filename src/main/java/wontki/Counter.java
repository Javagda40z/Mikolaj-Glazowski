package wontki;

public class Counter {
    private volatile int value;

    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
