
package oops;

public class methodoverload {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.print("venus");
        s1.print(21);
        Student s2=new Student();
        s2.print("anshul");
        
    }
    
}
class Student{
    String name;
    int age;
    void print(String name){

        System.out.println("name is:"+name);
    }
    void print(int age){
        System.out.println("age is:"+age);
    }
    void print(String name,int age){
        System.out.println("name is:"+ name+"age is:"+age);
    }
}
