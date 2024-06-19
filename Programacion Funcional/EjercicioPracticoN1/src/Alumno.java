public class Alumno {
    private String cedula;
    private String nombre;
    private String apellido;
    private Integer nota;
    private Integer edad;
    private Integer Id;
    private String curso;

    public Alumno() {
    }

    public Alumno(String cedula, String nombre, String apellido, Integer nota, Integer edad, Integer id, String curso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.edad = edad;
        Id = id;
        this.curso = curso;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "cedula='" + cedula +
                " nombre='" + nombre +
                " apellido='" + apellido +
                " nota=" + nota +
                " edad=" + edad +
                " Id=" + Id +
                " curso=" + curso;
    }
}
