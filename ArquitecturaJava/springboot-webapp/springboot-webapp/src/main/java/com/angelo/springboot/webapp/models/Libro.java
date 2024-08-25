package com.angelo.springboot.webapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros") //Colocamos el nombre de la tabla ya existente en nuestra bd
public class Libro {
    @Id
    @Column(name = "isb") //Nombre de la columna en la bd
    private Double isbn;
    @Column(name = "titulo")//Nombre de la columna en la bd
    private String titulo;
    @Column(name = "categoria")//Nombre de la columna en la bd
    private String categoria;

    public Libro() {
    }
    public Libro(Double isbn, String titulo, String categoria) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public Double getIsbn() {
        return isbn;
    }

    public void setIsbn(Double isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
