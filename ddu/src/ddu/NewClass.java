/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ddu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author ASUS
 */
public class NewClass {
    public static void main(String[] args) {
        mythread obj=new mythread();
        //create a thread pool...
        ExecutorService service= Executors .newFixedThreadPool(10);//10 thread ka thread pool bna diya
        //100 task karne hein.....
        for(int i=1;i<=100;i++){
            service.execute(obj);//100 task banaye but jo thread pool mai thread khali hai us swe task karvao
        }
        System.out.println(Thread.currentThread().getName());
    }
    
}
class mythread implements Runnable{
    public void run(){
        System.out.println("currently running:"+Thread.currentThread().getName());
    }
}
