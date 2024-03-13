public class Motor {
    private double cilindrada;
    private TipoMotor tipo1;

    public Motor() {
    }

    public Motor(double cilindrada, TipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo1 = tipo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo() {
        return tipo1;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo1 = tipo;
    }
}
