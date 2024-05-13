abstract public class Felino extends Mamifero {

    protected Float tamanioGarras;
    protected Integer velocidad;

    public Felino(String habitad, Float alutra, Float largo, Float peso, String nombreCientifico, Float tamanioGarras,
                  Integer velocidad) {
        super(habitad, alutra, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanioGarras() {
        return tamanioGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
