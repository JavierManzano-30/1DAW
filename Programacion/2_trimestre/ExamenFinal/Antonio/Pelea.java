
public class Pelea {

    private Boxeador b1, b2;

    public Pelea(Boxeador b1, Boxeador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public void iniciarCombate() {
        System.out.printf("La pelea comienza entre %s y %s%n", b1.getNombre(), b2.getNombre());
        while (continuarCombate()) {
        }
        finalizarCombate();

    }

    public boolean continuarCombate() {
        Boxeador atacante = (b1.getVelocidad() * Math.random() > b2.getVelocidad() * Math.random()) ? b1 : b2;
        Boxeador defensor = (atacante == b1) ? b2 : b1;

        registrarGolpe(atacante, defensor);

        return !defensor.estaDerrotado();
    }

    public void registrarGolpe(Boxeador atacante, Boxeador defensor) {
        if (!defensor.esquivarGolpe()) {
            defensor.recibirGolpe(atacante.getPotencia());
        }
    }

    public Boxeador determinarGanador() {
        if (b1.estaDerrotado()) {
            return b2;
        }
        if (b2.estaDerrotado()) {
            return b1;
        }
        return (b1.getResistencia() > b2.getResistencia()) ? b1 : b2;
    }

    public void finalizarCombate() {
        Boxeador ganador = determinarGanador();
        System.out.println("El ganador es: " + ganador.nombre);
    }

}
