public class Lobo extends Canino {

    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitad, Float alutra, Float largo, Float peso, String nombreCientifico, String color, Float tamanioColmillos) {
        super(habitad, alutra, largo, peso, nombreCientifico, color, tamanioColmillos);
    }

    @Override
    public String comer() {
        return "";
    }

    @Override
    public String dormir() {
        return "";
    }

    @Override
    public String correr() {
        return "";
    }

    @Override
    public String comunicarse() {
        return "";
    }
}
