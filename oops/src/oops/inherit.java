/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

public class inherit {
    public static void main(String[] args) {
        dog dog1=new dog();
        dog1.bark();
        dog1.walk();
        dog1.eat();
                
        
    }
}
class animal{
    void eat(){
        System.out.println("animal eat");
    }
}
class mammal extends animal{
    
    void walk(){
        System.out.println("mammals walk");
    }
}
class dog extends mammal{
   
    void bark(){
        
        System.out.println("dog barks");
    }
    
}