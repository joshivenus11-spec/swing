/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

public class encapsul {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.accountname="hdfcacc";
        account1.id=123;
        account1.setpassword(1234);
        System.out.println(account1.getpassword());
        
        
    }
    
    
}
 class Account{
    String accountname;
    int id;
    private int password;
    
    public int setpassword(int pass){
        return this.password=pass;
        
    }
    
    
    public int getpassword(){
        return this.password;
    }
}
