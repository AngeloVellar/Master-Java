public class Iphone extends Electronico {
    private String modelo;
    private String color;

    public Iphone(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
