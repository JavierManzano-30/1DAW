
public interface ICombate {

    void iniciarCombate();

    boolean continuarCombate();

    void registrarGolpe(Boxeador atacante, Boxeador defensor);

    Boxeador determinarGanador();

    void finalizarCombate();
}
