public class TcLcd extends Electronico{
    private int pulgada;

    public TcLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }
}
