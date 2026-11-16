import java.util.concurrent.Semaphore;

public class s {

    public static void main(String[] args) {

        Semaphore s = new Semaphore(1);

        Thread t1 = new Thread(() -> {

            try {
                s.acquire();

                for (int i = 1; i <= 5; i++) {
                    System.out.println(
                        "Being run by "
                        + Thread.currentThread().getName()
                        + " " + i + " time"
                    );
                }

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();

            } finally {
                s.release();
            }

        });

        Thread t2 = new Thread(() -> {

            try {
                s.acquire();

                for (int i = 1; i <= 5; i++) {
                    System.out.println(
                        "Being run by "
                        + Thread.currentThread().getName()
                        + " " + i + " time"
                    );
                }

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();

            } finally {
                s.release();
            }

        });

        t1.setName("thread1");
        t2.setName("thread2");

        t1.start();
        t2.start();
    }
}