
import java.time.Clock;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class mi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread mainthread=Thread.currentThread();
      Thread t1=new Thread(()->{
          System.out.println(Thread.currentThread().getName());
          System.out.println(mainthread.getState());
      
      });
      
        System.out.println(t1.getState());
        t1.start();
           System.out.println(t1.getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.getLogger(mi.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        System.out.println(t1.getState());
       
    }
    
}
