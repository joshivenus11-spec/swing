/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.v1;


public class V1 {

    public static void main(String[] args) {
           A student=new A("venus");
           student.name="vj";
           student=new A("hy");
           System.out.println(student.name);
    }
}
class A{
final int num=10;
String name;
A(String name){
    this.name=name;
}
}