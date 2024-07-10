package com.ar.peluqueriacanina.logica;

import jakarta.persistence.*;

@Entity
@Table(name = "duenios")
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_duenio;
    private String celularDuenio;
    private String nombre;
    private String direccion;

    public Duenio() {
    }

    public Duenio(int id_duenio, String celularDuenio, String nombre, String direccion) {
        this.id_duenio = id_duenio;
        this.celularDuenio = celularDuenio;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getCelularDuenio() {
        return celularDuenio;
    }

    public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
