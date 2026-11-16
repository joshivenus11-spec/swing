
package com.mycompany.staticexample;

public class Human {
    String name;
    int salary;
    int age;
    boolean married;
    static long population;
    static void message(){
        System.out.println("hello world");
       // System.out.println(this.age);//cannot do as message doesnt depend on object of human
    }
    public Human(int age,int salary,boolean married, String name){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        this.population+=1;
        Human.message();
    }

   
}
