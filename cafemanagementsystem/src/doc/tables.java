/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doc;

/**
 *
 * @author user
 */
public class tables {
   
        public static void main (String [] args)
        {
            try{
                String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),number varchar(10),address varchar(200),password varchar(200),status varchar(20),UNIQUE (email))";
                String adminDetails = "insert into user (name,email,number,address,password,status)values('Admin','admin@gmail.com','0913931089','Colombo','admin','true')";
                String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
                String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
                String billTable = "create table bill(id int primary key,name varchar(200),number varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
                DbOperations.setDataOrDelete(userTable,"User Table Created Successfully" );
                DbOperations.setDataOrDelete(adminDetails,"Admin Details Added Successfully" );
                DbOperations.setDataOrDelete(categoryTable,"Category Table Created Successfully" );
                DbOperations.setDataOrDelete(productTable,"Product Table Created Successfully" );
                DbOperations.setDataOrDelete(billTable,"Bill Table Created Successfully" );
            
            }
            catch (Exception e)
            {
            
            }
        }
    }
    

