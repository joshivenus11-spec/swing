package threading;

import java.util.concurrent.Semaphore;

public class example5 {

    public static void main(String[] args) {

        Semaphore s = new Semaphore(1);

        Thread t1 = new Thread(() -> {
            try {
                s.acquire();

                for (int i = 1; i <= 5; i++) {
                    System.out.println(
                        Thread.currentThread().getName() + "->" + i
                    );
                }

                s.release();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                s.acquire();

                for (int i = 1; i <= 5; i++) {
                    System.out.println(
                        Thread.currentThread().getName() + "->" + i
                    );
                }

                s.release();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
