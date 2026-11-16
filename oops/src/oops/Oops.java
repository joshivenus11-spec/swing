/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oops;

public class Oops {

    public static void main(String[] args) {
//        pen pen1=new pen();
//        pen1.color="blue";
//        pen1.type="gel";
//       
//          pen pen2=new pen();
//        pen2.color="black";
//        pen2.type="ballpoint";
//        
//        pen1.printcolor();
//        pen2.printcolor();

Student s1=new Student(23,25889,"venus");
        System.out.println("sapid is:"+s1.sapid);
        Student s2=new Student(s1);
      
    }
    
}
//class pen{
//    String type;
//    String color;
//   void write(){
//        System.out.println("writing something ");
//    }
//     void printcolor(){
//        System.out.println(this.color);
//       
//    }

class Student{
    String name;
    int age;
    int sapid;
   
    Student( int age,int sapid,String name){
        this.name=name;
        this.age=age;
        this.sapid=sapid;
        System.out.println("name is"+name);
        System.out.println("age is:"+age);
    }
    Student(Student s1){
        this.name=s1.name;
         System.out.println("name is:"+name);
            
    }
    
}
