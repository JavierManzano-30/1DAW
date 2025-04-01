public class Entrenador extends Participante{

    private Boxeador boxeador;

    public Entrenador(String nombre, int edad, Boxeador boxeador) {
        super(nombre, edad);
        this.boxeador = boxeador;
    }

    public Boxeador getBoxeador() {
        return boxeador;
    }

    public void setBoxeador(Boxeador boxeador) {
        this.boxeador = boxeador;
    }

    @Override
    public String toString() {
        return "Entrenador [Entrenador = " + getNombre() + ", boxeador = " + boxeador + "]";
    }

    @Override
    public void Presentarse() {
        System.out.println("Soy " + getNombre() + ", el entrenador de " + getBoxeador().getNombre() + ".");
    }

    public void motivar(Boxeador boxeador) {
        boxeador.mejorarEstadisticas();
    }
    
}
