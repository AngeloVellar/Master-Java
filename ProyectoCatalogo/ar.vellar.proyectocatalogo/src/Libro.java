import java.util.Date;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio,Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public Date getFechaPublicacion() {
        return null;
    }

    @Override
    public double getPrecioVenta() {
        return 90;
    }
}
