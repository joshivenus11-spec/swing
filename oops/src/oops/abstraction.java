/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

public class abstraction {
    public static void main(String[] args) {
        Animal obj=new dog() ;
        obj.setName("browny");
        System.out.println(obj.getName());
        
        obj.sleep();
        obj.sound();
        
    }
    
}
abstract class   Animal{
    private String name;
     String sound;

    public void setName(String name) {
        this.name = name;
       
    }

    public String getName() {
        return name;
    }
     
     public abstract  void sound();
     public void sleep(){
         System.out.println(".....zzzzz");
     }
}
class dog extends Animal{

  
    public void sound() {
        System.out.println("barks");
       
    }
    
}
