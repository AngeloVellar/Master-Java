package com.ar.peluqueriacanina.models;

import jakarta.persistence.*;

@Entity
@Table(name="clientes") //Lo ponemos para aclaraR que así se llama en la table mysql
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Motor sql
    private int num_cliente;
    private String nombre_perro;
    private String raza;
    private Color color;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    @OneToOne
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre_perro, String raza, Color color, String alergico, String atencion_especial, String observaciones, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAlergico() {
        return alergico;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
}
