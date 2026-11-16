/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ddu;

/**
 *
 * @author ASUS
 */
public class dunk {
    public static void main(String[] args) {
        myth t1=new myth("venus");
        myth2 t2=new myth2("earth");
        t1.start();
        t2.start();
    }
    
}
class myth extends Thread{
    String name;
    myth(String name){
        //this.name=name;
        super(name);
    }
    public void run(){
        System.out.println("name of the thread is:"+getName());
        
    }
}
class myth2 extends Thread{
    String name;
    myth2(String name){
        //this.name=n;
        super(name);
    }
    public void run(){
        System.out.println("name of the thread is:"+getName());
        
    }
}
