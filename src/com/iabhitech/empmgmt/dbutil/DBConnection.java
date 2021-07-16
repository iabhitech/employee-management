/*
 * Employee Management System
 * Designed By Abhineet Verma  * 
 */

package com.iabhitech.empmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhineet Verma
 */
public class DBConnection {
    private static Connection connection;

    static {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","root", "root");
            JOptionPane.showMessageDialog(null, "Connected to Database", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error while loading driver class", "Driver Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error while connecting to database", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
        }
    }
    
    public static Connection getConnection() {
        return connection;
    }
    
}
