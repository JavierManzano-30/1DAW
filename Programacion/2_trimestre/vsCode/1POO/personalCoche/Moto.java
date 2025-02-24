public class Moto extends Vehiculo {
    private int ruedas;
    
    public Moto(String marca, String modelo, int anio, double precio, int ruedas) {
        super(marca, modelo, anio, precio);
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public void CuantasRuedas() {
        System.out.println("La moto" + super.getMarca() + " tiene " + this.ruedas + " ruedas.");
    }

    @Override
    public void CuantasPuertas() {
        System.out.println("La moto" + super.getMarca() + " no tiene puertas.");
    }
}