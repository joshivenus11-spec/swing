






public class demo6 {
    static int sum=0;
    static int mul=1;
    public static void main(String[] args) {
      
          Thread t1=new Thread(()->
          {
              for(int i=1;i<=10;i++){
                  sum=sum+i;
              }
              System.out.println(Thread.currentThread().getName()+"->"+sum);
          });
          Thread t2=new Thread(()->
          {;
              for(int i=1;i<=5;i++){
                  mul=mul*i;
              }
              System.out.println(Thread.currentThread().getName()+"->"+mul);
          });
          Thread t3=new Thread(()->{
                  try{
                      t1.join();
                      t2.join();
                  }
                  catch(InterruptedException ex){
                  };
                  
                  
          int result=sum+mul;
              
              System.out.println(Thread.currentThread().getName()+"->"+result);
          });
          t1.setName("sumThread");
          t2.setName("multiplyThread");
          t3.setName("ResultThread");
          System.out.println("initial state of t1:"+t1.getState());
          System.out.println("initial state of t2:"+t2.getState());
          System.out.println("initial state of t3:"+t3.getState());
          t1.start();
          t2.start();
          
          t3.start();
        try {
            t3.join();
        } catch (InterruptedException ex) {
            System.getLogger(demo6.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
          System.out.println("t1 current state"+t1.getState());
          System.out.println("t2 current state"+t2.getState());
          System.out.println("t3 current state"+t3.getState());
          System.out.println("main thread over");
          
    }
    
}
