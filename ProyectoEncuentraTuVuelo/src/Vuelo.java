import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date llegada;
    private Integer CantPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date llegada, Integer cantPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.llegada = llegada;
        CantPasajeros = cantPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getLlegada() {
        return llegada;
    }

    public Integer getCantPasajeros() {
        return CantPasajeros;
    }
}
