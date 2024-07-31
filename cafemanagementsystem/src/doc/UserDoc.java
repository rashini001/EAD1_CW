/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doc;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class UserDoc {
    public static void save(User user){
        String Query = "insert into user(name,email,number,address,password,status) values ('"+user.getName()+"','"+user.getEmail()+"','"+user.getNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','false')";
        DbOperations.setDataOrDelete(Query,"Registered Successfully! Wait for Admin Approval!");
  
    }
    public static User Login(String email,String password){
    User user = null;
    try{
        ResultSet rs = DbOperations.getData("select * from user where email='"+email+"' and password = '"+password+"'");
        while(rs.next())
        {
            user = new User();
            user.setStatus(rs.getString("status"));
        }
       
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
    return user;
    }
    
    public static ArrayList<User> getAllRecords(String email){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from user where email like '%"+email+"%'");
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setNumber(rs.getString("number"));
                user.setAddress(rs.getString("address"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       return arrayList; 
    }
    
    public static void changeStatus(String email,String status){
        String Query = "update user set status = '"+status+"' where email = '"+email+"'";
        DbOperations.setDataOrDelete(Query,"Status Changed Successfully");
    }
    
    public static void changePassword(String email,String oldPassword,String newPassword){
        try{
            ResultSet rs = DbOperations.getData("select * from user where email='"+email+"' and password = '"+oldPassword+"'");
            if(rs.next()){
                update(email,newPassword);
            }
            else{
                JOptionPane.showMessageDialog(null,"Old Password is Wrong");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void update(String email,String newPassword){
        String Query = "update user set password = '"+newPassword+"' where email = '"+email+"'";
        DbOperations.setDataOrDelete(Query, "Password Changed Successfully");
    }
    public static void forgortPassword(String email){
        User user = null;
         try{
            ResultSet rs = DbOperations.getData("select * from user where email='"+email+"'" );
            while(rs.next()){
                user = new User();
                
                
                
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
}
