package org.vellar.poo_interfaces_repositorio.reposiorio;

import org.vellar.poo_interfaces_repositorio.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
