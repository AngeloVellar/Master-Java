public class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String getIFabricante() {
        return "";
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
