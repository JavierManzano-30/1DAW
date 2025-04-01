
public class Boxeador extends Participante {

    private double peso, velocidad, potencia, resistencia;
    private Categoria categoria;

    public Boxeador(String nombre, String nacionalidad, double peso, double velocidad, double potencia, double resistencia) {
        super(nombre);
        this.peso = peso;
        this.velocidad = velocidad;
        this.potencia = potencia;
        this.resistencia = resistencia;
        calcularCategoria();
    }

    public void calcularCategoria() {
        if (peso < 50) {
            categoria = Categoria.PESO_PLUMA;
        } else if (peso <= 70) {
            categoria = Categoria.PESO_LIGERO;
        } else if (peso <= 85) {
            categoria = Categoria.PESO_MEDIO;
        } else {
            categoria = Categoria.PESO_PESADO;
        }
    }

    public void recibirGolpe(double potenciaGolpe) {
        resistencia -= potenciaGolpe * 0.10;
        resistencia = Math.max(0, resistencia);
    }

    public boolean estaDerrotado() {
        return resistencia <= 0;
    }

    public boolean esquivarGolpe() {
        double probabilidad = velocidad * 0.40 + resistencia * 0.50;
        return Math.random() * 100 < probabilidad;
    }

    public void mejorarEstadisticas() {
        double porcentaje = resistencia / 100 * 4 + 3;
        velocidad += velocidad * porcentaje / 100;
        potencia += potencia * porcentaje / 100;
        resistencia += Math.min(100, resistencia);
    }

    public void mostrarEstado() {
        System.out.println("Estados:" + nombre + ", " + velocidad + ", " + potencia + ", " + resistencia);
    }

    @Override
    public void Presentarse() {
        System.out.println("Soy " + getNombre() + ", " + getCategoria() + " de " + getPeso() + "kg.");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        calcularCategoria();
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = Math.max(0, Math.min(resistencia, 100));
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
