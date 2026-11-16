/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class JavaApplication40 {

    public static void main(String[] args) {
        counter obj=new counter();
        Thread t1=new Thread(()->{
            for(int i=1;i<=1000;i++){
                obj.increment();
            }
        });
        
        Thread t2=new Thread(()->{
            for(int i=1;i<=1000;i++){
                obj.increment();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException ex){
            
        }
        System.out.println(obj.count);
        
        
    }
    
}
class counter{
    public int count=0;
    void increment(){
        synchronized (this) {
             count++;
            
        }
       
    }
}
