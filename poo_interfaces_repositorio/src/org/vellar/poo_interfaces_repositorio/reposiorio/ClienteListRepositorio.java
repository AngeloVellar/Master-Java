package org.vellar.poo_interfaces_repositorio.reposiorio;

import org.vellar.poo_interfaces_repositorio.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio,
        PaginableRepositorio{

    private List<Cliente> dataSourse; //Es donde se van almacenar los datos

    public ClienteListRepositorio() {
        this.dataSourse = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSourse;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for(Cliente cli: dataSourse){
            if(cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSourse.add(cliente);

    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSourse.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return null;
        }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return List.of();
    }
}

