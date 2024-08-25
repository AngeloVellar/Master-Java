package com.angelo.springboot.webapp.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static String url = "jdbc:mysql://localhost:3306/arquitectura";
    private static String username = "root";
    private static String password = "root";
    private static Connection coneccionbd;
    public static Connection getInstance() throws SQLException{
        if(coneccionbd == null){
            coneccionbd = DriverManager.getConnection(url,username,password);
        }
        return coneccionbd;
    }
    }
