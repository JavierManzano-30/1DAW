public class Sith extends SerVivo implements ILuchador {

    public Sith(String nombre, int defensa) {
        super(nombre, defensa);
    }

    @Override
    public void recibirDanio(int danio) {
        throw new UnsupportedOperationException("Unimplemented method 'recibirDanio'");
    }

    @Override
    public void luchar(ILuchador oponente) {
        // Los Sith utilizan agresivamente su poder para atacar
        int danio = calcularDanioAgresivo();
        // Aplica el daño al oponente
        oponente.recibirDanio(danio);
    }

    public void calcularDanioAgresivo() {

    }

    public void recibirDanio() {
        
    }
}
