package wontki;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class AppWatki {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Thread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(5000);
            return "plik";
        });

        if (!future.isDone()){
            System.out.println("Jeszcze nie");
            Thread.sleep(1000);
        }

        future.get();

        executorService.shutdown();

    }
}
