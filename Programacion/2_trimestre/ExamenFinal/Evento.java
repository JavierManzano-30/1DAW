public class Evento {
    private Pelea peleaEstelar;

    public void Evento() {
        this.peleaEstelar = peleaEstelar;
    }

    public void Evento(Pelea peleaEstelar) {
        Boxeador b1 = new Boxeador("Javier", 24, "española", 90, 85, 95, 80, null);
        Boxeador b2 = new Boxeador("Víctor", 26, "española", 95, 80, 95, 82, null);
    }

    public void iniciarEvento() {
        Pelea peleaEstelar = new Pelea();
        peleaEstelar.IniciaCombate();
    }
}
