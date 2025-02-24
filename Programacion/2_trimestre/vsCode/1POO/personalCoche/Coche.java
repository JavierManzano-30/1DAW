public class Coche extends Vehiculo {
    private int puertas;
    private int ruedas;

    public Coche(String marca, String modelo, int anio, double precio, int puertas, int ruedas) {
        super(marca, modelo, anio, precio);
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public void CuantasRuedas() {
        System.out.println("El coche" + super.getMarca() + " tiene " + this.ruedas + " ruedas.");
    }

    @Override
    public void CuantasPuertas() {
        System.out.println("El coche" + super.getMarca() + " tiene " + this.puertas + " puertas.");
    }
}