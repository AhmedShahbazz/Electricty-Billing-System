package project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wahaj khan
 */
import java.sql.*;
public class connectionprovider {
    public static Connection getCon(){
        try
        {
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity","root","its54m2001");
            return con;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return null;
        }
        }
    
}

