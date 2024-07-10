package com.ar.peluqueriacanina.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static String url = "jdbc:mysql://localhost:3306/peluqueria_canina?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "root";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if(connection == null){ //Si el conecction ya existe entonces..
            connection = DriverManager.getConnection(url,username,password); //Conección
        }
        return connection;
    }
}
