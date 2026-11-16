class Thread1 extends Thread{
    public void run(){
        System.out.println("name of thread t1 is"+Thread.currentThread().getName());
        System.out.println("the running thread is"+Thread.currentThread().getName());
    }
}
public class mythread {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        //Thread1 t2=new Thread1();
        //Thread1 t3=new Thread1();
        t1.start();
       // System.out.println("priority of t1:"+t1.getPriority());
        //System.out.println("priority of t2:"+t2.getPriority());
        //System.out.println("priority of t3:"+t3.getPriority());
       t1.setPriority(10);
        //t2.setPriority(2);
        //t3.setPriority(3);
        //System.out.println("priority of t1:"+t1.getPriority());
        //System.out.println("priority of t2:"+t2.getPriority());
        //System.out.println("priority of t3:"+t3.getPriority());
        System.out.println("currently executing thread is :"+Thread.currentThread().getName());
        //System.out.println("priority of main thraed is"+Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(10);
        //System.out.println("priority of main thread is"+Thread.currentThread().getPriority());
        System.out.println("hello ");
    }
    
}
