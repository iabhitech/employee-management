/*
 * Employee Management System
 * Designed By Abhineet Verma  * 
 */
package com.iabhitech.empmgmt.dao;

import com.iabhitech.empmgmt.dbutil.DBConnection;
import com.iabhitech.empmgmt.pojo.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhineet Verma
 */
public class EmployeeDao {

    public static boolean addEmployee(Employee e) throws SQLException {
        
        PreparedStatement ps = DBConnection.getConnection()
                .prepareStatement("insert into employee values(?,?,?)");

        ps.setInt(1, e.getId());
        ps.setString(2, e.getName());
        ps.setDouble(3, e.getSalary());

        return ps.executeUpdate() == 1;
    }

    public static Employee findEmployeeById(int empID) throws SQLException {
        
        PreparedStatement ps = DBConnection.getConnection()
                .prepareStatement("select 8 from employee where id=?");

        ps.setInt(1, empID);
        
        ResultSet rs = ps.executeQuery();
        
        Employee emp = null;
        
        if (rs.next()) {
            emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
        }
        
        return emp;
    }

    public static List<Employee> getAllEmployees() throws SQLException {

        ResultSet rs;
        rs = DBConnection
                .getConnection()
                .createStatement()
                .executeQuery("select * from employee");

        List<Employee> empList = new ArrayList<>();

        Employee temp;

        while (rs.next()) {
            temp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            empList.add(temp);
        }

        return empList;
    }
    
}
