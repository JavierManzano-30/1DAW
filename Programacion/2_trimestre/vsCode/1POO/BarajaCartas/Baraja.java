import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
    }

    public Baraja(ArrayList<Carta> cartas){
        this.cartas = cartas;
    }

    public void Ordenar(List<Carta> cartas) {
        
    }

    public void Barajar(List<Carta> cartas) {
        Collections.shuffle(cartas);
    }

    public Carta CogerPrimeraCarta(List<Carta> cartas) {
        return cartas.removeFirst();
    }

    public void Cortar(List<Carta> cartas) {

    }

    public void MezclaAmericana(List<Carta> cartas) {
        
    }
}