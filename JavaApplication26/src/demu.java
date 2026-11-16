
public class demu {
    public static void main(String[] args) {
        mythread t1=new mythread();
        t1.start();
        System.out.println("t1 thread has name:"+t1.getName());
//        System.out.println("priority of main thread is"+Thread.currentThread().getPriority());
//        System.out.println("priority of t1 thread is"+t1.getPriority());
//        Thread.currentThread().setPriority(7);
//        System.out.println("priority of main thread now is :"+Thread.currentThread().getPriority());
//        t1.setPriority(8);
//        System.out.println("priority of t1 thread  now is"+t1.getPriority());
        
    }
    
}
class mythread extends Thread{
    //public void run(){
      //  System.out.println("name of thread t1 is:"+Thread.currentThread().getName());
   // }
}
