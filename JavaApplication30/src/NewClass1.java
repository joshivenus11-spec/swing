
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

//There is a Gate Which can be open by 1 thread and Display Name of that thread at a time use semaphore 
//to control the gate with per thread from thread pool where 50 threads are going to take lock on that gate.
public class NewClass1 {
    public static void main(String[] args) {
        Semaphore s =new Semaphore(1);
        //create a thread pool of 50 thread
        ExecutorService executor=Executors.newFixedThreadPool(50);
        for(int i=1;i<=50;i++){
                executor.execute(()->{
                    try {
                        s.acquire();
                        Thread.sleep(1000);
                        System.out.println("gate is opened by"+Thread.currentThread().getName());
                        s.release();
                    } catch (InterruptedException ex) {
                        System.getLogger(NewClass1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                    }
                });
            }
        executor.shutdown();
            }
            
        }
    
    

