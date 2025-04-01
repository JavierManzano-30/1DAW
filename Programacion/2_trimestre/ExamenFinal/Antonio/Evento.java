
public class Evento {

    private Pelea peleaEstelar;

    public Evento(Pelea peleaEstelar) {
        this.peleaEstelar = peleaEstelar;
    }

    public Evento() {
        //SE CREAN PELEA TO WAPA Y PELEA TO WAPA Y PELEA TO WAPA POR DEFECTO
    }

    public void iniciarEvento() {
        peleaEstelar.iniciarCombate();
    }
}
