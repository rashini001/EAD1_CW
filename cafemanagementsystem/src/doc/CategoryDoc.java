/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doc;
import java.util.ArrayList;
import model.Category;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author user
 */
public class CategoryDoc {
    public static void save(Category Category){
        String Query = "insert into category (name) values ('"+Category.getName()+"')";
        DbOperations.setDataOrDelete(Query,"Category Added Successfully");
          
    }
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from category");
            while(rs.next())
            {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    return arrayList;
    }
    public static void delete (String id){
        String Query = "delete from category where id ='"+id+"'";
        DbOperations.setDataOrDelete(Query, "Category Delete Successfuly");
        
    }
    
}
