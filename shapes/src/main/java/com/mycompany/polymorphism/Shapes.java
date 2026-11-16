package com.mycompany.polymorphism;
public class Shapes {
    void area(){
        System.out.println("i am in shapes");
    }

   
   
    
}
class circle extends Shapes{
    //@Override
   final void area(){
        System.out.println("area is pi*r*r");
    }
    
}
class triangle extends Shapes{
    //@Override
    void area(){
        System.out.println("area is 0.2*b*h");
    }
    
}
class square extends Shapes{
    //@Override
    void area(){
        System.out.println("area is side*side");
    }
    
}