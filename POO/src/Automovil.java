public class Automovil {
    String fabricante;
    String color;
    String modelo;
    double cilindrada;
    int capacidadDeltanque = 40;

    public String verDetalle(){
        return "Fabricante = " + this.fabricante +
                "Cilindrada" + this.cilindrada +
                "Color" + this.color +
                "Modelo" + this.modelo;
    }
    public String acelerar(int rpm){
        return "el auto" + " " + fabricante +" " + "acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return fabricante + " " + modelo + " " + "frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;

    }

    public float calcularConsumo(int km, float porcentajeBencina ){
        return km/(capacidadDeltanque*porcentajeBencina);
    }
    public float calcularConsumo(int km, int porcentajeBencina ){
        return km/(capacidadDeltanque*(porcentajeBencina / 100f));
    }
}
