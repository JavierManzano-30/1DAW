public class Tranvia extends TransportePublico{
    private boolean electrico;
    private String linea;
    
    public Tranvia(int capacidad, String ruta, double velocidadMaxima, boolean electrico, String linea) {
        super(capacidad, ruta, velocidadMaxima);
        this.electrico = electrico;
        this.linea = linea;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public void arrancar() {
        System.out.println("El tranvía se nos va.");
    }

    @Override
    public void parar() {
        System.out.println("El tranvía se nos ha quedado parado.");
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Elevtrico: " + (electrico ? "SI" : "NO"));
        System.out.println("Linea: " + linea);
    }
}
