
package threading;

public class Threading {

    public static void main(String[] args) {
        counter obj=new counter();
        Thread t1=new Thread(()->{
            for(int i=1;i<=10;i++){
                obj.increment();
            }
        });
         Thread t2=new Thread(()->{
            for(int i=1;i<=10;i++){
                obj.increment();
            }
        });
         t1.start();
         t2.start();
         try{
             t1.join();
             t2.join();
         }
         catch(InterruptedException ex){
             
         }
         System.out.println(obj.count );
        
       
    }
    
}
class counter{
    int count=0;
     synchronized void increment(){
        count++;
    }
}