
package threading;

public class example2 {
    public static void main(String[] args) {
        myrunnable obj1=new myrunnable();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj1);
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
        
    }
    
}
class myrunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        
    }
}
