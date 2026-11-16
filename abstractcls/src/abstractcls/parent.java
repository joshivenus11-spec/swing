
package abstractcls;

 abstract public class parent {
     int age;
     final int value = 908765;
     public parent(int age,int value){//abstract constructor not allowed 
         this.age=age;
         
     }
//      abstract static void greeting(){statc abstract methods cannnot be made 
//         System.out.println("hello");
//     }
     static void greeting(){
         System.out.println("hello");
     }//static methods can be maxde
     
    abstract  void career(String name);
    abstract void partner(String name,int age);
    
}
