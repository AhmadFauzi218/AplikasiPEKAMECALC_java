/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus_bku;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class koneksi {

    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String Url="jdbc:mysql://localhost/ujicoba (1)";
            String User="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(Url, User, pass);
        }catch(Exception e){
            System.out.println("koneksi gagal" +e.getMessage());
        }
        return mysqlconfig;
    }
}
