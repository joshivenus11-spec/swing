/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class demo3 {
    public static void main(String[] args) {
        Mythread obj=new Mythread();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
     
//        t1.start();
//        t2.start();
t1.run();
    }
    
}
class Mythread implements Runnable{
    public void run(){
        System.out.println("name of my thread is:"+Thread.currentThread().getName());
    }
}
