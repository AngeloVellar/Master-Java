abstract public class Mamifero {

    protected String habitad;
    protected Float alutra;
    protected Float largo;
    protected Float peso;
    protected String nombreCientifico;

    public Mamifero(String habitad, Float alutra, Float largo, Float peso, String nombreCientifico) {
        this.habitad = habitad;
        this.alutra = alutra;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitad() {
        return habitad;
    }

    public Float getAlutra() {
        return alutra;
    }

    public Float getLargo() {
        return largo;
    }

    public Float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    abstract public String comer();
   abstract public String dormir();
   abstract public String correr();
   abstract public String comunicarse();
}
