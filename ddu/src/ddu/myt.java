/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ddu;

/**
 *
 * @author ASUS
 */
public class myt {
    public static void main(String[] args) {
        //make a lot of threads together
        for(int i=1;i<=10;i++){
        mythread obj=new mythread();
       Thread t1=new Thread(obj);
        t1.start();
        }
        //System.out.println("thread name:"+ Thread.currentThread().getName()); 
        
    }
    
}
class mythread implements Runnable{
    public void run(){
        System.out.println("thread name: "+Thread.currentThread().getName());
    }
}
