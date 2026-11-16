/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ff {
    public static void main(String[] args) {
       
        Thread t1=new Thread(()->{
            for(int i=1;i<2;i++){
                counter.increment();    
            }}
        );
        Thread t2=new Thread(()->{
            for(int i=1;i<2;i++){
                counter.increment();   }}
        );
        t1.start();
        t2.start();
        try{
        t1.join();
        t2.join();
        }
        catch (InterruptedException ex){ };
        //System.out.println(obj.count);
    }
    
    
}
class counter{
     static int count=0;
   synchronized static void increment(){
            count++;
            System.out.println(count);
       }
   
       
    }
