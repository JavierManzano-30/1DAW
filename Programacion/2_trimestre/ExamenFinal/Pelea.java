public class Pelea implements ICombate{
    private Boxeador b1;
    private Boxeador b2;
    private Arbitro arbitro;

    @Override
    public void IniciaCombate() {
        if (continuarCombate() == true) {
            registrarGolpe(b1, b2);
        }else {
            finalizarCombate();
        }
    }

    @Override
    public boolean continuarCombate() {
        if (b1.getResistencia() <= 0) {
            return false;
        }else if (b2.getResistencia() <= 0) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void registrarGolpe(Boxeador b1, Boxeador b2) {
        if (b1.esquivarGolpe() == true && b2.esquivarGolpe() == true) {
            continuarCombate();
        }else if (b1.esquivarGolpe() == false) {
            b1.recibirGolpe(b2.getPotencia());
        }else if (b2.esquivarGolpe() == false) {
            b2.recibirGolpe(b1.getPotencia());
        }
    }

    @Override
    public Boxeador determinarGanador() {
        if (b1.getResistencia() <= 0) {
            return b2;
        }else if (b2.getResistencia() <= 0) {
            return b1;
        }else if (b1.getResistencia() > b2.getResistencia()) {
            return b1;
        }else {
            return b2;
        }
        
    }

    @Override
    public void finalizarCombate() {
        System.out.println("El ganador del combate ha sido: " + determinarGanador());
    }

    @Override
    public String toString() {
        return "Pelea [boxeador 1= " + b1 + ", boxeador 2= " + b2 + ", arbitro= " + arbitro + "]";
    }

    
}
