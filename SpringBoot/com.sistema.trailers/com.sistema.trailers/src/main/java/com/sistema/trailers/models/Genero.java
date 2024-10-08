package com.sistema.trailers.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //Indicamos primero que va ser una entidad
public class Genero { //Esta entidad de genero se queda en la bdd

    @Id
    @Column(name = "id_genero")
    private Integer id;

    private String titulo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero(String titulo) {
        this.titulo = titulo;
    }

    public Genero(Integer id) {
        this.id = id;
    }

    public Genero() {
    }

    public Genero(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
}
