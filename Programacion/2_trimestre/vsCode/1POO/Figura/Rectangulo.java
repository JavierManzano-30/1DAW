public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }

    @Override
    public double CalcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectangulo: base = " + base + ", altura = " + altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
