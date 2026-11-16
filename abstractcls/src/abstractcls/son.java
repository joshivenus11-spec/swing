
package abstractcls;

public class son extends parent  {
    public son(int age,int value){
        super(age,value);
        
    }
   
    
    static void greeting(){
         parent.greeting();
     }
    @Override
    void career(String name){
        System.out.println("i want to be "+name);
        
    }
    @Override
    void partner(String name,int age){
        System.out.println("i love"+name+"age is:"+age);
        
    }
    
}
