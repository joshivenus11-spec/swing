

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class demo2 {
//    static   boolean flag=false;
    public static void main(String[] args) {
        b b1=new b();
        Thread t1=new Thread(()->{
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException ex){
            
            };
            b1.flag=true;
        });
        Thread t2=new Thread(()->{
            while(b1.flag==false){
                System.out.println("oh");//synchronise
            }
            System.out.println("completed");
        });
        t1.start();
        t2.start();
    }
}
class b{
    public boolean flag=false;
}