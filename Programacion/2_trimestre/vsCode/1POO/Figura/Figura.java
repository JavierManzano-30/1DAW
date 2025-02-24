public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract double CalcularArea();

    abstract double CalcularPerimetro();

    @Override
    public String toString() {
        return "Figura: " + nombre;
    }

    public void ImprimirDetalle() {
        System.out.println("figura: " + getNombre());
        System.out.println("Area: " + CalcularArea());
        System.out.println("Perimetro: " + CalcularPerimetro());
    }
}
