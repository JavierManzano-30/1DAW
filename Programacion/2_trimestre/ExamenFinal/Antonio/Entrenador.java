
public class Entrenador extends Participante {

    private Boxeador boxeador;

    public Entrenador(String nombre, Boxeador boxeador) {
        super(nombre);
        this.boxeador = boxeador;
    }

    public void motivarBoxeador() {
        boxeador.mejorarEstadisticas();
    }

    @Override
    public void Presentarse() {
        System.out.println("Soy " + nombre + ", el entrenador de " + boxeador.nombre + ".");
    }

}
