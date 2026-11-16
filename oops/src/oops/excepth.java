/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

public class excepth {
    public static void main(String[] args) {
        
    
    int i=10;
    int j=10;
    int nums[]=new int[5];
    try{
    int result=i/j;
        System.out.println(nums[5]);
}
    catch(ArithmeticException e){
    System.out.println("cannot divide by zero");
}
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("array index not in limit");
    }
        System.out.println(j);
    
}
}
