/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class example3 {
    public static void main(String[] args) {
        
    
    ExecutorService executor=Executors.newFixedThreadPool(10);
    for(int i=1;i<=100;i++){
    int Tid=i;
    executor.execute(()->{
    System.out.println(Thread.currentThread().getName()+"->"+Tid);
});
}
    }
    
}
