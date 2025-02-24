import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Carta[] mano;
    private Carta[] baraja;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new Carta[7];
        this.baraja = new Carta[40];
    }

    public Jugador(String nombre, Carta[] baraja) {
        this.nombre = nombre;
        this.mano = new Carta[7];
        this.baraja = baraja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta[] getMano() {
        return mano;
    }

    public void setMano(Carta[] mano) {
        this.mano = mano;
    }

    public Carta[] getBaraja() {
        return baraja;
    }

    public void setBaraja(Carta[] baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + ", baraja=" + baraja.length + "]";
    }

    public void RobarCarta(Carta[] baraja) {
        
    }

    public void JugarCarta() {

    }

    public void Atacar() {

    }
}