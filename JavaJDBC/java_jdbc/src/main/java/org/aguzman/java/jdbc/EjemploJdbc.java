package org.aguzman.java.jdbc;

import org.aguzman.java.jdbc.models.Categoria;
import org.aguzman.java.jdbc.models.Producto;
import org.aguzman.java.jdbc.repositori.ProductoRepositorioImpl;
import org.aguzman.java.jdbc.repositori.Repositorio;
import org.aguzman.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

        try (Connection  conn = ConexionBaseDatos.getInstance()){ //Conección
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl(); //repasar
            repositorio.Listar().forEach(System.out::println);

            System.out.println(repositorio.porId(2L)); //Imprime el objeto que coincida con el ID proporcionado

            Producto producto = new Producto();
            producto.setNombre("Teclado mecánico Red Dragon");
            producto.setPrecio(503);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito");
            repositorio.Listar().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
