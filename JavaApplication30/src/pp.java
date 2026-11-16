

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class pp {
    public static void main(String[] args) {
        Test obj=new Test();
//        Test obj1=new Test();
        Thread t1=new Thread(()->obj.show());
        Thread t2=new Thread(()->obj.show2());
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
                
    }
    
}
class Test{
    Object lock1=new Object();
    Object lock2=new Object();
     void show(){
         synchronized (lock1) {
             
         
        System.out.println( "I am "+Thread.currentThread().getName()+"inside show");
        try{
        Thread.sleep(1000);
        }
        catch(InterruptedException ex){
        };
        System.out.println("i am "+Thread.currentThread().getName()+"show finished");
        }
     }
    
    synchronized void show2(){
        synchronized (lock2) {
            
        
        System.out.println( "I am "+Thread.currentThread().getName()+"inside show");
        try{
        Thread.sleep(1000);
        }
        catch(InterruptedException ex){
        };
        System.out.println("i am "+Thread.currentThread().getName()+"show finished");
        }
    }
}
    
            

