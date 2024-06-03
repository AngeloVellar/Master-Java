import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
   private List<T> productos;
   private int indiciceProducto;
   private int max = 5;

    public BolsaSupermercado() { //Consultar al chat
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void addProduct(T p){
        if(this.productos.size() <= max) {
            this.productos.add(p);
        } else{
            throw new RuntimeException("No hay mas espacio.");
        }
    }


}

