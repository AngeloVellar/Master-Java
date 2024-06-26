package org.aguzman.java.jdbc;

import org.aguzman.java.jdbc.models.Producto;
import org.aguzman.java.jdbc.repositori.ProductoRepositorioImpl;
import org.aguzman.java.jdbc.repositori.Repositorio;
import org.aguzman.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelate {
    public static void main(String[] args) {

        try (Connection  conn = ConexionBaseDatos.getInstance()){ //Conección
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl(); //repasar
            repositorio.Listar().forEach(System.out::println);

            System.out.println(repositorio.porId(2L)); //Imprime el objeto que coincida con el ID proporcionado

            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con éxito!");
            repositorio.Listar().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
