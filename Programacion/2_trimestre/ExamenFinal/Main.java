public class Main {
    public static void main(String[] args) {
        //Boxeador juan = new Boxeador("Juan", 20, "Española", 50, 100, 75, 80.0, CategoriaPeso.PESO_PLUMA);
        Participante arbitro = new Arbitro("Hernán", 30);
        System.out.println(arbitro);
        Evento evento = new Evento();
        evento.iniciarEvento();
    }
}