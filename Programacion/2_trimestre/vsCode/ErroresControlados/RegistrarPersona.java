import java.util.Scanner;

public class RegistrarPersona {
    private String nombre;
    private int edad;
    private String telefono;

    public RegistrarPersona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "RegistrarPersona [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + "]";
    }

    Scanner sc = new Scanner(System.in);

    try
}
