/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ddu;

/**
 *
 * @author ASUS
 */
public class nc3 {
   
    public static void main(String[] args) {

        test obj = new test();

        myt t1 = new myt(obj);
        myt2 t2 = new myt2(obj);

        t1.start();
        t2.start();
    }
}

class test {

    synchronized public void run() {
        show();
    }

    public void show() {

        System.out.println(
            Thread.currentThread().getName() + " → show started"
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
            Thread.currentThread().getName() + " → show ended"
        );
    }
}
class myt extends Thread{
    test t;
    myt(test t){
        this.t=t;
    }
    public void run(){
        t.run();
}
}
class myt2 extends Thread{
    test t;
    myt2(test t){
        this.t=t;
    }
    public void run(){
        t.run();
}
}