
package com.mycompany.staticint;

public class Staticint {
    static int a=4;
    static int b;
    static{
        System.out.println("i am static block");
        b=a*5;
    }

    public static void main(String[] args) {
        Staticint obj=new Staticint();
        System.out.println("value of a is"+a+"and value of b is"+b);
        Staticint. b+=3;
        Staticint obj2=new Staticint();
        System.out.println("value of a is"+a+"and value of b is"+b);
      
    }
}
