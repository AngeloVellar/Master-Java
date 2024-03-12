import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    //              ATRIBUTOS DE LA CLASE
    private Integer identificador;
    private String descripcion;
    private Date fecha;

    private Cliente cliente;
    private Producto[] productos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    //               METODOS GETTERS AND SETTERS


    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String mostrarOrdenCompra() {
        return "OrdenCompra{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", productos=" + Arrays.toString(productos) +
                '}';
    }
}
