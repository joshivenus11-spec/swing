

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class pc {
    public static void main(String[] args) {
        Buffer obj=new Buffer();
        Thread t1=new Thread(()->{
            for(int i=1;i<=20;i++){
                try{
            Thread.sleep(100);
        }
        catch(InterruptedException ex)
        {
        };
                obj.producer(i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=20;i++){
                try{
            Thread.sleep(70);
        }
        catch(InterruptedException ex)
        {
        };
                obj.consumer();
            }
        });
        t1.start();
        t2.start();
    }
    
}
class Buffer{
   volatile Integer item=null;
    volatile boolean flag=false;
   synchronized void producer(int value){
        while(flag==true){
            try {
                wait();
                //infinite loop m daldo agar andr koi value hai to
            } catch (InterruptedException ex) {
                System.getLogger(Buffer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        
       
        
       
        item=value;
        flag=true;
         System.out.println("produced an item "+value);
         notify();
         
        
    }
     synchronized void consumer(){
        while(flag==false){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.getLogger(Buffer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            
        }
System.out.println("consumed an item"+ item);
        item=null;
        flag=false;
        notify();
        
       
      
       
        
    }
    
}
