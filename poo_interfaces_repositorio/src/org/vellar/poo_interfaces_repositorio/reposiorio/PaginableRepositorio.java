package org.vellar.poo_interfaces_repositorio.reposiorio;

import org.vellar.poo_interfaces_repositorio.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde,int hasta);
}
