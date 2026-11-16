import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main2 {
  
    public static void main(String[] args) {
        ExecutorService executor=Executors .newFixedThreadPool(2);
        for(int i=1;i<=5;i++){
            int tid=i;
            executor.execute(()->{
                System.out.println("task"+tid+"is performed by"+Thread.currentThread().getName());
            });
        }
        
        
    }
}

   
        
     
    

        
    
