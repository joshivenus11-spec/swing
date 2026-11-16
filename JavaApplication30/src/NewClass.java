
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class NewClass {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(2);
        for(int i=1;i<=5;i++){
            int Tid=i;
            executor.execute(()->{
                System.out.println("task"+Tid+"is performed by"+Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
    
}
