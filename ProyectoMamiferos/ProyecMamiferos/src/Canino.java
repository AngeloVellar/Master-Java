abstract  public class Canino extends Mamifero {
    protected String color;
    protected Float tamanioColmillos;

    public Canino(String habitad, Float alutra, Float largo, Float peso, String nombreCientifico, String color, Float tamanioColmillos) {
        super(habitad, alutra, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public Float getTamanioColmillos() {
        return tamanioColmillos;
    }
}
