/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

import java.util.concurrent.Semaphore;

/**
 *
 * @author ASUS
 */
public class JavaApplication33 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1=new Thread(()->
        System.out.println(Thread.currentThread().getName()+"is running"));
        Thread t2=new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"is running");
        });
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println("main thread terminated");
    }
}
