public class Automovil {
    private int id;
    private String fabricante;
    private Color color = Color.GRIS;
    private String modelo;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
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


    public Automovil(String fabricante, Color color, String modelo, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,color,modelo,motor,tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

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

    public Automovil(String fabricante, Color color, String modelo, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, Color color, String modelo, Motor motor, Tanque tanque) {
        this(fabricante,color,modelo,motor);
        this.motor = motor;
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

    public Motor motor() {
        return motor;
    }

    public void setCilindrada(Motor motor ) {
        this.motor = motor;
    }

    public Tanque tanque() {
        return tanque;
    }

    public void setCapacidadDelTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
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
       String detalle=  "auto.Id = " + this.id +
                "\nFabricante = " + this.getFabricante() +
                "\nCilindrada" + this .motor().getCilindrada();

            if(this.getTipo() != null){
                detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
            }
                detalle +="\nautto.patenteColor = " + colorPatente +
                "\nColor" + this.getColor() +
                "\nModelo" + this.getModelo();
       return detalle;
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
        return km/(tanque.getCapacidad() * porcentajeBencina);
    }
    public float calcularConsumo(int km, int porcentajeBencina ){
        return km/(this.tanque.getCapacidad() * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoStatico(int km, int porcentajeBencina){
         return km / (Automovil.capacidadDelTanqueEstatico * (porcentajeBencina / 100f));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo;
    }
}
