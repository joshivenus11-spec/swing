package threading;

public class prodconsu {

    public static void main(String[] args) {

        box obj = new box();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                obj.producer(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                obj.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}

class box {

     volatile Integer item;
     volatile boolean flag = false;

    synchronized void producer(int value) {

        while (flag == true) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        item = value;
        flag = true;

        System.out.println("Producer produced " + value);

        notify();
    }

    synchronized void consumer() {

        while (flag == false) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Consumer consumed " + item);

        item = null;
        flag = false;

        notify();
    }
}
