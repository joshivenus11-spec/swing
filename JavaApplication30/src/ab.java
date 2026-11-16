

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ab {
    public static void main(String[] args) {
        Account obj=new Account();
        Thread t1=new Thread( ()->obj.deposit());
        Thread t2=new Thread( ()->obj.withdrawl());
        t1.start();
        t2.start();
    }
}
class Account{
    Object lock1=new Object();
    Object lock2=new Object();
     void deposit(){
         synchronized (lock1) {
         
        try {
            System.out.println("deposit");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.getLogger(Account.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
         }
    }
    void withdrawl(){
        synchronized (lock2) {
            
        
        System.out.println("withdrawl");
    }
}
}