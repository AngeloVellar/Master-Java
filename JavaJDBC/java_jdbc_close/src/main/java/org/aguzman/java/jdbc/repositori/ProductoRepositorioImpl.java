package org.aguzman.java.jdbc.repositori;

import org.aguzman.java.jdbc.models.Categoria;
import org.aguzman.java.jdbc.models.Producto;
import org.aguzman.java.jdbc.util.ConexionBaseDatos;

import javax.naming.NamingEnumeration;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto> {

    private Connection getConecction() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Producto> Listar() {
        List<Producto> productos = new ArrayList<>();
        try(Statement stmt = getConecction().createStatement();  //creamos la declaración
            ResultSet rs = stmt.executeQuery("SELECT p.*, c.nombre as categoria FROM productos as p" +
                    " inner join categorias as c ON (p.categoria_id = c.id")){ //Realizar consulta
            while(rs.next()){
                Producto p = crearProducto(rs);
                productos.add(p);
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return productos;
    }

    @Override
    public Producto porId(Long id) throws SQLException {    //Repasar
        Producto producto = null;
        try(PreparedStatement stmt = getConecction().//para ejecutar la consulta SQL
                prepareStatement("SELECT p.*, c.nombre as categoria FROM productos as p " +
                "inner join categorias as c ON (p.categoria_id = c.id) WHERE p.id = ?")){ //selecciona todos los campos de la tabla productos donde el id coincide con el valor proporcionado.
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    producto = crearProducto(rs);
                }
            } //Ejecuta la consulta SQL y guarda el resultado en un ResultSet, que es una tabla de datos que representa el resultado de la consulta SQL.
        }catch (SQLException e){
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) {
        String sql;
        if (producto.getId() != null && producto.getId()>0) {
            sql = "UPDATE productos SET nombre=?,precio=?,categoria_id=?, WHERE id=?";
        } else {
            sql = "INSERT INTO productos(nombre,precio,categoria_id,fecha_registro) VALUES(?,?,?,?)";
        }
        try(PreparedStatement stmt = getConecction().prepareStatement(sql)){
            stmt.setString(1,producto.getNombre());
            stmt.setLong(2,producto.getPrecio());
            stmt.setLong(3,producto.getCategoria().getId());

            if(producto.getId() != null && producto.getId() > 0){
                stmt.setLong(4,producto.getId());
            } else {
                stmt.setDate(4,new Date(producto.getFechaRegistro().getTime()));
            }
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void eliminar(Long id) {
        try(PreparedStatement stmt = getConecction().prepareStatement("DELETE FROM productos WHERE id=?")){
            stmt.setLong(1,id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Producto crearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setFechaRegistro(rs.getDate("fecha_registro"));
        Categoria categoria = new Categoria();
        categoria.setId(rs.getLong("categoria_id"));
        categoria.setNombre(rs.getString("categoria"));
        p.setCategoria(categoria);
        return p;
    }
}
