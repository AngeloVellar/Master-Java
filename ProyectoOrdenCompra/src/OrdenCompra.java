import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    //              ATRIBUTOS DE LA CLASE
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indProductos;

    public OrdenCompra(String descripcion) {    //Repasar
        this.descripcion = descripcion;
        this.productos = new Producto[4];
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
        String detalle = "OrdenCompra{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", productos=" + Arrays.toString(productos) +
                '}';
        return detalle;
    }

    public void addProducto(Producto producto) { //Repasar

        for (int i = 0; i < this.productos.length; i++) {
            this.productos[i] = producto;
        }

//        if(indProductos < this.productos.length){     SEGUNDA MANERA DE HACERLO
//            this.productos[indProductos++] = producto;
    }
    public int getGranTotal(){
        int total = 0;
        for(Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }

}



