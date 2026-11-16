/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class k {
    public static void main(String[] args) {
        odd obj=new odd();
        Thread t1=new Thread(obj,"eventhread");
       
        Thread t2=new Thread(obj,"oddthread");
        t1.start();
        t2.start();
        
    }
    
}
class odd implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
                if(i%2!=0){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
    }
    
}
class even implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
    }
    
}

