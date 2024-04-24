/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;




/**
 *
 * @author sgrac
 */
public class connectionprovider {
    public static Connection getcon(){
        
    
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","@ic54997N");
      return con;
    }
    catch(ClassNotFoundException | SQLException e)
    {
        return null;
    }
}
}
