/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletoncc;

/**
 *
 * @author ASUS
 */
public class Singletoncc {

    public static void main(String[] args) {
        A obj=A.getinstance();
        obj.num=98;
    }
}
class A{
    int num;
    private A (){
        
    }
    private static A instance;
    public static A getinstance(){
        if(instance==null){
            instance =new A();
        }
        return instance;
    }
}