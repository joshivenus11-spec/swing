
package threading;

public class NewClass {
    public static void main(String[] args) {
        Table obj=new Table();
        Thread t1=new Thread(()->{
            int num=5;
            obj.printT(5);
        });
        
         Thread t2=new Thread(()->{
            int num=5;
            obj.printT(6);
        });
         t1.start();
         t2.start();
        
    }}
class Table{
    void printT(int num){
        synchronized (this) {
            for(int i=1;i<=5;i++){
        System.out.println(num+"*"+i+"="+num*i);
    }
            
        }
        
    }
}
  
