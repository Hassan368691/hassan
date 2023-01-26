
package banking.manegment.application;

import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    conn(){
    try{
    c = DriverManager.getConnection("jdbc:mysql:///BankingManegmentApplication","hassan","368691");
    s = c.createStatement();
    }catch(Exception e){
    System.out.println(e);
    }
    
    }
    
}
