import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Jedi extends SerVivo implements ILuchador {

    private int nivelFuerza;
    private HashMap<String, Integer> habilidadesEspeciales;
    private ArrayList<ITransporte> naves;
    private Droide droide;
    private Planeta planetaOrigen;

    public Jedi(String nombre, int defensa, int nivelFuerza,
            ArrayList<ITransporte> naves, Droide droide, Planeta planetaOrigen) {
        super(nombre, defensa);
        this.nivelFuerza = nivelFuerza;
        this.habilidadesEspeciales = new HashMap<>();
        this.naves = naves;
        this.droide = droide;
        this.planetaOrigen = planetaOrigen;

        this.habilidadesEspeciales.put("ForceHeal", 1);
        this.habilidadesEspeciales.put("JediMindTrick", 2);
        this.habilidadesEspeciales.put("ForceReflex", 3);
        this.habilidadesEspeciales.put("SuperAtaque", 4);

    }

    public int getNivelFuerza() {
        return nivelFuerza;
    }

    public void setNivelFuerza(int nivelFuerza) {
        this.nivelFuerza = nivelFuerza;
    }

    public HashMap<String, Integer> getHabilidadesEspeciales() {
        return habilidadesEspeciales;
    }

    public void setHabilidadesEspeciales(HashMap<String, Integer> habilidadesEspeciales) {
        this.habilidadesEspeciales = habilidadesEspeciales;
    }

    public ArrayList<ITransporte> getNaves() {
        return naves;
    }

    public void setNaves(ArrayList<ITransporte> naves) {
        this.naves = naves;
    }

    public Droide getDroide() {
        return droide;
    }

    public void setDroide(Droide droide) {
        this.droide = droide;
    }

    public Planeta getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(Planeta planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }

    @Override
    public void recibirDanio(int danio) {
        throw new UnsupportedOperationException("Unimplemented method 'recibirDanio'");
    }

    public int calcularDanioDefensivo() {
        return 0;
    }

    public int calcularHabilidadEspecial() {
        Random random = new Random();

        int numAleatorio = random.nextInt(4) + 1;

        if (numAleatorio == getHabilidadesEspeciales().get("SuperAtaque")) {
            return 4;
        }else return 0;
    }
    
    public void luchar(SerVivo oponente) {
        // Los Jedi utilizan su defensa y habilidades especiales para luchar
        int danio = calcularDanioDefensivo();
        // Aplica el daño al oponente
        oponente.recibirDanio(danio);
    }

}
