public class Tigre extends Felino  {

    private String especieTigre;

    public Tigre(String habitad, Float alutra, Float largo, Float peso, String nombreCientifico, Float tamanioGarras, Integer velocidad) {
        super(habitad, alutra, largo, peso, nombreCientifico, tamanioGarras, velocidad);
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

    @Override
    public String comer() {
        return "Los Tigres comen gaselas u otro tipo de animal hervivoro u omnivoros ";
    }
}
