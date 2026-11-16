package javaapplication41;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class JavaApplication41 {

    public static void main(String[] args) {

        Semaphore s = new Semaphore(3);

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 7; i++) {

            int id = i;

            executor.execute(() -> {

                try {
                    s.acquire();

                    System.out.println(
                        Thread.currentThread().getName()
                        + " using resource -> " + id
                    );

                    Thread.sleep(1000);

                    System.out.println(
                        Thread.currentThread().getName()
                        + " finished resource -> " + id
                    );

                    s.release();

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
    }
}