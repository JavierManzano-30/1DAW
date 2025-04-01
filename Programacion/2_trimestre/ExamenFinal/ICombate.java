public interface ICombate {
    public void IniciaCombate();
    public boolean continuarCombate();
    public void registrarGolpe(Boxeador b1, Boxeador b2);
    public Boxeador determinarGanador();
    public void finalizarCombate();
}
