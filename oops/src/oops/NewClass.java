public class NewClass{
    public static void main(String[] args) {
        Bank obj=new Bank();
        obj.setaccount_number("v1234");
        obj.setbalance(890089.0);
        obj.getinfo(obj.getaccount_number());
        obj.calcul();
        Account obj1=new Account();
        obj1.calcul();
        
        
        
        
        
        
        
    }
}
class Bank{
    private String account_number;
    private double balance;
    public void setaccount_number(String acc_num){
        this.account_number=acc_num;
    }
    public String getaccount_number(){
        return account_number;
    }
    
    public void setbalance(double bal){
        this.balance=bal;
    }
    public double getbalance(){
        return balance ;
    }
    public void calcul(){
        System.out.println("calculating current balance");
    }
    public void getinfo(String account_number,double balance){
        System.out.println("account number is:"+this.account_number +"balance is:"+this.balance);
    }
    public void getinfo(String account_number){
        System.out.println("account number is"+this.account_number);
    }
     public void getinfo(double balance){
        System.out.println("account number is"+this.balance);
    
    
}
}
     class Account extends Bank{
        public void calcul(){
            System.out.println("calculates current balance for specific account");
        }
         
     
         
     }

