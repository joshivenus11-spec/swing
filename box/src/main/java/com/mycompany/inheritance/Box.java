
package com.mycompany.inheritance;
public class Box {
    int height;
    int width;
    private int length;
    
Box(int height,int width,int length){
    this.height=height;
    this.width=width;
    this.length=length;
//    System.out.println("in box class");
    
}
public int getl(){
    return length;
}
static void greeting(){
    System.out.println("i am in box class");
}
//cube
Box(int side){
    this.height=side;
    this.length=side;
    this.width=side;
    
}
Box(){
int height=-1;
    int width=-1;
    int length=-1;
    super();
    
}
Box( Box old){
    this.height=old.height;
    this.width=old.width;
    this.length=old.length;
}
public void info(){
    System.out.println("running the box");
}
}
class boxweight extends Box{
    int weight;
    boxweight(){
        super();
        int weight=-1;
        
        
    }
    static void greeting(){
    System.out.println("i am in boxweight class");
}
    boxweight(int weight){
     
        this.weight=weight;
    }
    boxweight(int height,int width,int length,int weight){
        super(length,width,height);
//        System.out.println(super.length);
        this.weight=weight;
        System.out.println("in boxweight class");
    }
    boxweight(boxweight other){
        super(other);
        this.weight=other.weight;
        
    }
    
}
class Boxprice extends boxweight{
    int price;
    Boxprice(int price){
        super();
        this.price=-1;
    }
    Boxprice(int price,int weight){
        super(weight);
    }
    Boxprice(Boxprice other){
        super(other);
        this.price=other.price;
    }
    Boxprice(int length,int height,int width,int weight,int price){
        super(length,height,width,weight);
        this.price=price;
        System.out.println("inside boxprice class");
    }
}

