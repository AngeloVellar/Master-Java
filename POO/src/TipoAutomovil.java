public enum TipoAutomovil {
    SEDAN("Sedan", "Auto normal", 4),
    SATION_WAGON("Station Wagon", "Auto grande", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible","Auto deportivo", 2),
    TRAFIC("Trafic", "Auto utilitario", 4);


    private final String nombre;
    private final int numpuertas;
    private final String descripcion;

    TipoAutomovil(String nombre,String descripcion,int numpuertas){
        this.nombre = nombre;
        this.numpuertas = numpuertas;
        this.descripcion = descripcion;

    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPuertas() {
        return numpuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
