/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.products;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author antony
 */
public class MyConnection {
    
     public  java.sql.Connection getConnection() {
        java.sql.Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.err.println( ex.getMessage());
        }

        try {
            String jdbc = "jdbc:mysql://ipro.lambton.on.ca/inventory";
            con = DriverManager.getConnection(jdbc, "products", "products");
        } catch (SQLException ex) {
            System.err.println( ex.getMessage());
        }
        return con;
    }
}