package bankapplication;
import java.sql.*;

public class Conn {
    
     Connection c;
     Statement s;
    public Conn(){
        try{
//            Class.forName(com.mysql.cj.jdbc.driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagmentsystem","root","root");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
}
