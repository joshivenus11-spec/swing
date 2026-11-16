/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=1;i<=3;i++){
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        });
        
        Thread t2=new Thread(()->{
            for(int i=1;i<=3;i++){
                if(i%2!=0){
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        });
        t1.setPriority(1);
        t2.setPriority(4);
        t1.start();
        t2.start();
    }
}
