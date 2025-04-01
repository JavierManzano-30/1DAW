
public abstract class Participante {

    protected String nombre;
    protected int edad;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public abstract void Presentarse();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
