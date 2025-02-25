public class Autobus extends TransportePublico{

    private int numeroParadas;
    private double tarifa;

    public Autobus(int capacidad, String ruta, double velocidadMaxima, int numeroParadas, double tarifa) {
        super(capacidad, ruta, velocidadMaxima);
        this.numeroParadas = numeroParadas;
        this.tarifa = tarifa;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public void arrancar() {
        System.out.println("Tussam nos lleva a la feria.");
    }

    @Override
    public void parar() {
        System.out.println("Parada solicitada.");
    }
    
    
}
