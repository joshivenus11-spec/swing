/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadp;

/**
 *
 * @author ASUS
 */
public class Threadp {
    public static void main(String[] args) {
        block obj=new block();
        Thread t1=new Thread(()->{
            try{
                Thread.sleep(1000);
                System.out.println("inside t1 thread");
                obj.flag=true;
            }
            catch(InterruptedException ex){
                
            }
            
        });
        Thread  t2=new Thread(()->{
            while(obj.flag==false){
                System.out.println("inside t2 thread");
                
            }
        });
        t1.start();
        t2.start();
        
    }
    
    
    
}
class block{
   volatile  boolean flag=false;
}
