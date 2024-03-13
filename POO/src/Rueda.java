public class Rueda {
    private String fabricante;
    private int aro;
    private double ancho;

    public Rueda(String fabricante, Integer aro, Double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Integer getAro() {
        return aro;
    }

    public Double getAncho() {
        return ancho;
    }
}
