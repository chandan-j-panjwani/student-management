
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cpanj
 */
public class MySQLConnect {
    /*
    * the below method creates a connection with mysql database named as "student_mgmt" with user account and pw as provided
    * It returns the Java.sql.Connection Object if the connection was successfully established otherwise returns null
    */
    public static Connection getConnection(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgmt","chandan","chandan");
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Connection Failed"+e.getMessage());
            return null;
        }
    }
    
//    public static void main(String[] args) {
//        Connection conn = getConnection();
//        if(conn!=null){
//            JOptionPane.showMessageDialog(null,"Connection Established!");
//        }
//    }
}
