
package jdbccon;

import com.sun.jdi.connect.spi.Connection;

public class Jdbccon {
   
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
            
        }
       String url="jdbc:mysql://localhost:3306/mydatabase1";
       String username="root";
       String password ="Venus475";
   
           Connection con=Driver Manager.getConn(url,username,password);
           
     
    }
    
}
