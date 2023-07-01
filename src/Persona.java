public class Persona {

    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private int edad;
    private  String genero;
    private static int  numeroPesonas = 0;

    // Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPesonas;
    }

    // Constructor con argumentos
    public Persona(String nombre, String telefono, String email, int edad, String genero)
    {
        this();
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
