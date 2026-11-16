


public class prodcons {
    public static void main(String[] args) {
        box obj=new box();
        Thread t1=new Thread(()->{
            try{
                Thread.sleep(10);
            
            for(int i=1;i<=5;i++){
                obj.producer(i);
            }
            }
            catch(InterruptedException ex){
                
            }
        });
        
        Thread t2=new Thread(()->{
            try{
                Thread.sleep(10);
            
            for(int i=1;i<=5;i++){
                obj.consumer();
            }
            }
            catch(InterruptedException ex){}
        
    });
        t1.start();
        t2.start();
    
}
                
}
class box{
   volatile Integer item;
   volatile boolean flag=false;
    synchronized void producer(int value ){
        while(flag==true){
            
            try {
                wait();
            } catch (InterruptedException ex) {
                System.getLogger(box.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        item=value;
        System.out.println("producer produces->"+item);
        
        flag=true;
        //notify();
        }
        
        
    
  synchronized void consumer(){
       while(flag==false){
           try {
               wait();
           } catch (InterruptedException ex) {
               System.getLogger(box.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
           }
           
       }
       System.out.println("consumer consumes->"+item);
       item=null;
       flag=false;
       //notify();
   }
}
