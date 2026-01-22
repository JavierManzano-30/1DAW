public class Participacion {

    public Visitante jugador;
    public Juego juego;
    public int puntuacion;

    public Participacion(Visitante jugador, Juego juego, int puntuacion) {
        this.jugador = jugador;
        this.juego = juego;
        this.puntuacion = puntuacion;
    }

    public Visitante getJugador() {
        return jugador;
    }

    public void setJugador(Visitante jugador) {
        this.jugador = jugador;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Participacion [jugador=" + jugador + ", juego=" + juego + ", puntuacion=" + puntuacion + "]";
    }

    public boolean esGanador() throws ExcepcionPuntuacionExcedida.puntuacionExcedida{
        boolean verdad = true;

        try {
        switch (juego.dificultad) {
            case FACIL:
                if (puntuacion >= (70 * juego.puntuacionMaxima) / 100) {
                    verdad = true;
                }
                break;
            case MEDIA:
                if (puntuacion >= (80 * juego.puntuacionMaxima) / 100) {
                    verdad = true;
                }
            case DIFICIL:
                if (jugador.esVip = true && puntuacion >= (80 * juego.puntuacionMaxima) / 100
                        || puntuacion >= (90 * juego.puntuacionMaxima) / 100) {
                    verdad = true;
                }
            default:
                if (juego.soloVip = true && jugador.esVip == false) {
                    verdad = false;
                }
                break;
        }
        return verdad;
        if (puntuacion > 100) {
            throw new ExcepcionPuntuacionExcedida.puntuacionExcedida("Es mucha puntuacion");
        }
        } catch (ExcepcionPuntuacionExcedida.puntuacionExcedida e) {
            System.out.println(e.getMessage());
        }
    }

    public String mostrarResultado() {
        return "Nombre jugador: " + jugador.nombre + "| juego: " + juego.nombre + "| puntuación: " + this.puntuacion
                + "| ha ganado: " + esGanador();
    }
}
