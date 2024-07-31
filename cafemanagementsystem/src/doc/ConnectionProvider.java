/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doc;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author user
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafesystem?useSSL=false","root","Ra1shi**");
            return con;
        }
        catch (Exception e)
        {
            
            return null;
        }
    }
            
    
    
}
