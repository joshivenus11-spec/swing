/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread;

/**
 *
 * @author ASUS
 */
public class Thread {

    public static void main(String[] args) {
       odd t1=new odd();
       even t2=new even();
       t1.start();
       t2.start();
    }
    
}
class odd extends Thread{
    public void run(){
        for(int i=1;i<=9;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
class even extends Thread{
    public void run(){
        for(int i=2;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
