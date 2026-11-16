
package threading;

public class example1 {
    public static void main(String[] args) {
        mythread t1=new mythread();
        mythread t2=new mythread();
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
        
        
    }
}

  class mythread extends Thread{
      public void run(){
          System.out.println(Thread.currentThread().getName());
      }
   }
   
       
        
    
    

