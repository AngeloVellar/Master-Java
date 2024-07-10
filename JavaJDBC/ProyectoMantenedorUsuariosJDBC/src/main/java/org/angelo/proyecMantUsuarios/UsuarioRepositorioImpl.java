package org.angelo.proyecMantUsuarios;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorioImpl implements Repositorio<Usuario> {

    private Connection getConecction() throws SQLException{ //Método para realizar la coneccion
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Usuario> Listar() {
        List<Usuario> usuarios = new ArrayList<>();
        try(Statement stmt = getConecction().createStatement();
            ResultSet rs = stmt.executeQuery() {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }

    @Override
    public Usuario porId(Long id) throws SQLException {
        try(

        ){

        }
        return null;
    }

    @Override
    public void guardar(Usuario usuario) throws SQLException {

    }

    @Override
    public void eliminar(Long id) {

    }
}
