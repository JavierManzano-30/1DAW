
public class Arbitro extends Participante {

    private Pelea pelea;

    public Arbitro(String nombre, Pelea pelea) {
        super(nombre);
        this.pelea = pelea;
    }

    public void detenerPelea() {
        pelea.finalizarCombate();
    }

    @Override
    public void Presentarse() {
        System.out.println("El arbitro " + nombre + " se presenta en la pelea.");
    }
}
