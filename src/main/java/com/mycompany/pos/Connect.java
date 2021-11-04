package com.mycompany.pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/pos";
    private final String database = "products";
    private final String username = "root";
    private final String password = "";
    
    private Connection con = null;
    
    public Connect(){
        try{
            Class.forName(driver);
        }
        catch(ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
    public Connection conn(){
        try{
            con = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    public void closeConnect(){
        try{
            this.con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
