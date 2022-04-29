/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanagersystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class passworddata {
        Connection conn=null;
     
    public static Connection java_db(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite://E:\\TY BcsCS\\project\\sem 6/passms.db");
        System.out.println("conectign...");
        return conn;
    } catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }    
    }     
    
}
