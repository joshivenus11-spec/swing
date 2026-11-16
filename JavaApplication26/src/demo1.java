/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class demo1 {
    public static void main(String[] args) {
        even t1=new even();
        odd t2 =new odd();
        t1.start();
        t2.start();
        
    }
    
}
class even extends Thread{
    public void run(){
        System.out.println("hy i am printing even");
    }
}
class odd extends Thread{
    public void run(){
        System.out.println("hy i am printing odd");
    }
}
