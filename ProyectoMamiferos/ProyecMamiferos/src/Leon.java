public class Leon extends Felino{


    private Integer numManada;
    private Float potenciaRugidoDecibel;

    public Leon(String habitad, Float alutra, Float largo, Float peso, String nombreCientifico, Float tamanioGarras
            , Integer velocidad, Integer numManada, Float potenciaRugidoDecibel) {
        super(habitad, alutra, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "Un leon adulto puede llegar a devorar hasta 40 Kg. de carne en una sola comida";
    }

    @Override
    public String dormir() {
        return "Los leones duermen hasta 20 horas al día";
    }

    @Override
    public String correr() {
        return "Un león puede correr hasta 74 km/h";
    }

    @Override
    public String comunicarse() {
        return "Se comunica atraves del rugido";
    }
}
