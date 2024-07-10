package org.angelo.proyecMantUsuarios;

import java.sql.SQLException;
import java.util.List;

public interface Repositorio<T>{
    List<T> Listar();

    T porId(Long id) throws SQLException;

    void guardar(T t) throws SQLException;

    void eliminar(Long id);

}
