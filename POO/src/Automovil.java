public class Automovil {
    private int id;
    private String fabricante;
    private Color color = Color.GRIS;
    private String modelo;
    private double cilindrada;
    private int capacidadDelTanque = 40;
    private TipoAutomovil tipo;
    private static Color colorPatente = Color.NARANJA;

    //                                ---ATRIBUTOS ESTATICOS---
    private static int capacidadDelTanqueEstatico = 30;
    private static int ultimoId;

    //                                ---ATRIBUTOS CONSTANTE FINAL---
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_NEGRO = "Negro";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_VERDE = "Verde";


    //                          ---METODOS INICIALIZADORES Y GET-SET----


    public Automovil(){
        this.id = ++ultimoId;
    }
     public  Automovil(String fabricante, String modelo){
         this();
         this.fabricante = fabricante;
         this.modelo = modelo;

     }
    public  Automovil(String fabricante, String modelo,Color color){
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, Color color, String modelo, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, Color color, String modelo, double cilindrada, int capacidadDelTanque) {
        this(fabricante,color,modelo,cilindrada);
        this.capacidadDelTanque = capacidadDelTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadDelTanque() {
        return capacidadDelTanque;
    }

    public void setCapacidadDelTanque(int capacidadDelTanque) {
        this.capacidadDelTanque = capacidadDelTanque;
    }

    public static Color getColorPatente(){
         return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
         Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadDelTanqueEstatico() {
        return capacidadDelTanqueEstatico;
    }

    public static void setCapacidadDelTanqueEstatico(int capacidadDelTanqueEstatico) {
        Automovil.capacidadDelTanqueEstatico = capacidadDelTanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

   public void setTipo(TipoAutomovil tipo) {
      this.tipo = tipo;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



//                  METODOS FUNCIONALES
    public String verDetalle(){
        return  "auto.Id = " + this.id +
                "\nFabricante = " + this.getFabricante() +
                "\nCilindrada" + this.getCilindrada() +
                "\nauto.tipo = " + this.getTipo().getDescripcion() +
                "\nautto.patenteColor = " + colorPatente +
                "\nColor" + this.getColor() +
                "\nModelo" + this.getModelo();
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
        return km/(capacidadDelTanque*porcentajeBencina);
    }
    public float calcularConsumo(int km, int porcentajeBencina ){
        return km/(capacidadDelTanque*(porcentajeBencina / 100f));
    }

    public static float calcularConsumoStatico(int km, int porcentajeBencina){
         return km / (Automovil.capacidadDelTanqueEstatico * (porcentajeBencina / 100f));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo;
    }
}
