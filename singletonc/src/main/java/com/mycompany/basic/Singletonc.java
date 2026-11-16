
package com.mycompany.basic;

public class Singletonc {

    public static void main(String[] args) {
//        A obj=new A();as it is private constructor 
A obj=A.getinstance();
obj.num=45;
System.out.println(obj.num);
        
    }
}
class A{
    int num;
    private A(){
        
    }
    private static A instance;
    public static A getinstance(){
    if(instance == null){
    instance =new A();
}
    return instance;
    }
    
}
