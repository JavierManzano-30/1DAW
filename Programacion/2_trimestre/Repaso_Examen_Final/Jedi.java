import java.util.ArrayList;
import java.util.HashMap;

public class Jedi extends SerVivo implements ILuchador {

    private int nivelFuerza;
    private HashMap<String, Integer> habilidadesEspeciales;
    private ArrayList<ITransporte> naves;
    private Droide droide;
    private Planeta planetaOrigen;

    public Jedi(String nombre, int defensa, int nivelFuerza, HashMap<String, Integer> habilidadesEspeciales,
            ArrayList<ITransporte> naves, Droide droide, Planeta planetaOrigen) {
        super(nombre, defensa);
        this.nivelFuerza = nivelFuerza;
        this.habilidadesEspeciales = habilidadesEspeciales;
        this.naves = naves;
        this.droide = droide;
        this.planetaOrigen = planetaOrigen;
    }

    @Override
    public void recibirDanio(int danio) {
        throw new UnsupportedOperationException("Unimplemented method 'recibirDanio'");
    }

    public void calcularDanioDefensivo() {

    }

    @Override
    public void luchar(ILuchador oponente) {
        // Los Jedi utilizan su defensa y habilidades especiales para luchar
        int danio = calcularDanioDefensivo();
        // Aplica el daño al oponente
        oponente.recibirDanio(danio);
    }

    public void recibirDanio() {

    }
}
