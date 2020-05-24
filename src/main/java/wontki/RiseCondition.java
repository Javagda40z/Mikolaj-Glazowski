package wontki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RiseCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable runnable = () -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
//                System.out.println("Counter: " + counter.getValue() + " Thread: " + Thread.currentThread());
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();



        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.shutdown();

        System.out.println(counter.getValue());
    }
}
