public class Arbitro extends Participante {
    public Arbitro(String nombre, int edad) {
        super(nombre, edad);
    }

    public boolean detenerCombate(ICombate combate) {
        combate.finalizarCombate();
        return true;
    }

    @Override
    public String toString() {
        return "Arbitro [nombre= " + getNombre() + ", edad= " + getEdad() + "]";
    }

    @Override
    public void Presentarse() {
        System.out.println("Soy " + getNombre() + ", el árbitro de la pelea.");
    }
}
