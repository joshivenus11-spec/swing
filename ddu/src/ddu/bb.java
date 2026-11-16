package ddu;

public class bb {

    public static void main(String[] args) {

        data obj = new data();

        thr1 t1 = new thr1(obj);
        thr2 t2 = new thr2(obj);
        thr3 t3 = new thr3(obj);

        // Start T1 and T2 together
        t1.start();
        t2.start();

        // Wait for T1 and T2
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Now T3 starts
        t3.start();
    }
}


// Shared data
class data {

    int[] square = new int[500];
    int[] cube = new int[500];

    // SYNCHRONIZED METHOD
    synchronized void storeSquare(int index, int value) {
        square[index] = value;
    }
}


// T1 → Square
class thr1 extends Thread {

    data d;

    thr1(data d) {
        this.d = d;
    }

    public void run() {

        System.out.println("----- SQUARES -----");

        for (int i = 1; i <= 500; i++) {

            int sq = i * i;

            // Calling synchronized method
            d.storeSquare(i - 1, sq);

            System.out.println(
                    Thread.currentThread().getName()
                    + " : " + i + "^2 = " + sq
            );
        }
    }
}


// T2 → Cube
class thr2 extends Thread {

    data d;

    thr2(data d) {
        this.d = d;
    }

    public void run() {

        System.out.println("----- CUBES -----");

        for (int i = 1; i <= 500; i++) {

            int cb = i * i * i;

            // SYNCHRONIZED BLOCK
            synchronized (d) {
                d.cube[i - 1] = cb;
            }

            System.out.println(
                    Thread.currentThread().getName()
                    + " : " + i + "^3 = " + cb
            );
        }
    }
}


// T3 → Square × Cube
class thr3 extends Thread {

    data d;

    thr3(data d) {
        this.d = d;
    }

    public void run() {

        System.out.println("----- MULTIPLICATION -----");

        for (int i = 0; i < 500; i++) {

            synchronized (d) {

                System.out.println(
                        d.square[i]
                        + " * "
                        + d.cube[i]
                        + " = "
                        + (d.square[i] * d.cube[i])
                );
            }
        }
    }
}