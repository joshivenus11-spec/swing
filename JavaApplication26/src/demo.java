
//public class demo {

   
//    public static void main(String[] args) {
//        even t1=new even();
//        odd t2=new odd();
//        t1.start();
//        t2.start();
//        
//    }
//    
////}
class even extends Thread{
    public void run(){
        System.out.println("even numbers are");
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }
}
class odd extends Thread{
    public void run(){
        System.out.println("odd numbers are");
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        
    }
}
public class demo {

   
    public static void main(String[] args) {
        even t1=new even();
        odd t2=new odd();
        t1.start();
        t2.start();
    }
}
    
    
//}