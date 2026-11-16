// Create 3 thread t1,t2 and t3 using Synchronization Method and Block .
//T1 thread will display perfect square and t2 perfect que of a 
//number like x^3 and t3 thread will print multiplication of t1*t2 as result and range of number will be from 1-500.
public class hy {
    public static void main(String[] args) {
        Calculation obj=new Calculation();
        Thread t1=new Thread(()->
                    obj.square() );
        Thread t2=new Thread(()->
        obj.cube());
        Thread t3=new Thread(()->{
            try{
                t1.join();
                t2.join();
            }
            catch(InterruptedException ex){
                
            }
             obj.multiplication();
                    
                });
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
class Calculation{
     int sresult=0;
     int cresult=0;
    synchronized void square(){
        System.out.println(" perfect squares are");
        for(int i=1;i<=500;i++){
            if(i*i<=500){
                sresult=i*i;
                System.out.println(i+"^"+2+"="+i*i);
            }
        }
        
    }
     synchronized void cube(){
         System.out.println(" perfect cubes are");
        for(int i=1;i<=500;i++){
            if(i*i*i<=500){
                cresult=i*i*i;
                System.out.println(i+"^"+3+"="+i*i*i);
            }
        }
        
    }
    synchronized void multiplication(){
        System.out.println("multiplication is");
        System.out.println(sresult*cresult);
        
    }
}
