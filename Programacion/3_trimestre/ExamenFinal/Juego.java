public class Juego {
    
    public String nombre;
    public int puntuacionMaxima;
    public TipoDificultad dificultad;
    public boolean soloVip;
    
    public Juego(String nombre, int puntuacionMaxima, TipoDificultad dificultad, boolean soloVip) {
        this.nombre = nombre;
        this.puntuacionMaxima = puntuacionMaxima;
        this.dificultad = dificultad;
        this.soloVip = soloVip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    public void setPuntuacionMaxima(int puntuacionMaxima) {
        this.puntuacionMaxima = puntuacionMaxima;
    }

    public TipoDificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(TipoDificultad dificultad) {
        this.dificultad = dificultad;
    }

    public boolean isSoloVip() {
        return soloVip;
    }

    public void setSoloVip(boolean soloVip) {
        this.soloVip = soloVip;
    }

    @Override
    public String toString() {
        return "Juego [nombre=" + nombre + ", puntuacionMaxima=" + puntuacionMaxima + ", dificultad=" + dificultad
                + ", soloVip=" + soloVip + "]";
    }

    
}
