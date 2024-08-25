package com.angelo.springboot.webapp.models;

import java.sql.Connection;
import java.sql.SQLException;

import com.angelo.springboot.webapp.models.ConexionBD;
public class LibroRepositorioImpl {
    private Connection getConnection() throws SQLException {
        return ConexionBD.getInstance();
    }

}
