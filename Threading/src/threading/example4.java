/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threading;

public class example4 {
    public static void main(String[] args) {
       
        Thread t1=new Thread(()->{
            Table.printTable(5);
        });
         Thread t2=new Thread(()->{
            Table.printTable(2);
        });
         t1.start();
         t2.start();
    }
    
}
 class Table{
    synchronized static void printTable(int n){
         
            
        
        for(int i=1;i<=5;i++){
            System.out.println(n +"*"+i+ "=" +n*i);
        
        }
    }
}
