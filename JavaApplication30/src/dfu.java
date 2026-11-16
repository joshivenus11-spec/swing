

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class dfu {
    public static void main(String[] args) {
        Thread t1=new Thread(()->
        {
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        });
        Thread t2=new Thread(()->
        {
            for(int i=1;i<=10;i++){
                if(i%2!=0){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        });
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t1.setName("eventhread");
        t2.setName("odd thread");
        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.getLogger(dfu.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
    
}
