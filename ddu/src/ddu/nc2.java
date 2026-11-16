package ddu;

public class nc2 {
    public static void main(String[] args) {

        counter obj = new counter();

        mythread1 t1 = new mythread1(obj);
        mythread2 t2 = new mythread2(obj);

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            System.getLogger(nc2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            System.getLogger(nc2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        System.out.println(obj.count);
    }
}

class counter {
    int count = 0;

    synchronized public void count() {
        count++;
    }
}

class mythread1 extends Thread {
    counter obj;

    mythread1(counter obj) {
        this.obj = obj;
    }

    public void run() {
        for(int i=1;i<=1000;i++){
        obj.count();
    }
}
}

class mythread2 extends Thread {
    counter obj;

    mythread2(counter obj) {
        this.obj = obj;
    }

    public void run() {
        for(int i=1;i<=1000;i++){
        obj.count();
    }
}}