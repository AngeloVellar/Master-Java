package org.angelo.api.stream.ejemplos.models;

public class Factura {
    private String descripcion;
    private Usuario usuario;


    public String getDescripcion() {
        return descripcion;
    }

    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
