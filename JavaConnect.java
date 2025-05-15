/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 91981
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
      Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:D:\\project\\Library Management System\\LibraryNew.sqlite");
                    return conn;
        }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
  }
}
  