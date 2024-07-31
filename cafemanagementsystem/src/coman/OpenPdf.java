/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coman;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File ("E:\\"+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler E:\\" +id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null,"File is not Exists");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        
        }
    }
}
