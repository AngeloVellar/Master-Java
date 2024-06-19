
public class Automovil {
    private String modelo;
    private double motor;
    private String patente;
    private String marca;
    private double kilometros;

    public Automovil(String modelo, double motor, String patente, String marca, double kilometros) {
        this.modelo = modelo;
        this.motor = motor;
        this.patente = patente;
        this.marca = marca;
        this.kilometros = kilometros;

    }
    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




    public String toString() {
        return "-- Automovil-- ; " +
                "Kilometros = " + kilometros +
                " marca = " + marca +
                " patente = " + patente +
                " motor = " + motor +
                " modelo = " + modelo;
    }
}
