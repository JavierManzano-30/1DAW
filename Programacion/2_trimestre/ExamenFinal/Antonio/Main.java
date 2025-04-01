
public class Main {

    public static void main(String[] args) {
        Boxeador b1 = new Boxeador("Canelo", "Mexico", 1.0, 1.0, 99.0, 80.0);
        Boxeador b2 = new Boxeador("Floyd Mayweather", "Estados Unidos", 85.0, 95.0, 1.0, 1.0);

        Pelea pelea = new Pelea(b1, b2);

        Evento evento = new Evento(pelea);

        evento.iniciarEvento();
    }
}
