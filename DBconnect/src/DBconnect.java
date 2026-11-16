import java.sql.*;
import java.util.Scanner;

public class DBconnect {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/mydatabase1";
        String username = "root";
        String password = "Venus475";
        String query="insert into account(id,name,balance) values(?,?,?)";
        
        try{
        Connection con=DriverManager.getConnection(url,username,password);
        con.setAutoCommit(false);
         PreparedStatement ps=con.prepareStatement(query);
        Scanner sc=new Scanner(System.in);
        
        while(true){
            
            int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        double balance=sc.nextDouble();
        sc.nextLine();
        con.setAutoCommit(false);
       
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, balance);
            ps.addBatch();
             
                System.out.println("want to insert more values?(Y/N");
                String response=sc.nextLine();
                if(response.toUpperCase().equals("N")){
                    break;
                }
        }
        int[]batchresult=ps.executeBatch();
            System.out.println("batch insertion successful");
        con.commit();
        
                
                   
                }
        
        
        
        catch(SQLException ex){
            ex.printStackTrace();
            
        }

        
    }
}
