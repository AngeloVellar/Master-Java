package org.aguzman.java.jdbc;

import org.aguzman.java.jdbc.models.Categoria;
import org.aguzman.java.jdbc.models.Producto;
import org.aguzman.java.jdbc.repositori.ProductoRepositorioImpl;
import org.aguzman.java.jdbc.repositori.Repositorio;
import org.aguzman.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {

        try (Connection  conn = ConexionBaseDatos.getInstance()){ //Conección
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl(); //repasar
            repositorio.Listar().forEach(System.out::println);

            System.out.println(repositorio.porId(2L)); //Imprime el objeto que coincida con el ID proporcionado

            Producto producto = new Producto();
            producto.setId(3L);
            producto.setNombre("Teclado Razer");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado");
            repositorio.Listar().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
