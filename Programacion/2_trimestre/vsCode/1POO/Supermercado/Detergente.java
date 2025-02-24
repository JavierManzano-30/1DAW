public class Detergente extends Producto{
    private double volumen;
    private String tipoEnvase;
    private int descuento;

    public Detergente(String marca, double precio, int id, double volumen, String tipoEnvase, int descuento) {
        super(marca, precio, id);
        this.volumen = volumen;
        this.tipoEnvase = tipoEnvase;
        this.descuento = descuento;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getPrecioDescuento(int descuento) {
        double elDescuento = (this.getPrecio() * descuento )/ 100;
        return getPrecio() - elDescuento;
    }

    @Override
    public String toString() {
        return "Detergente [volumen=" + volumen + ", tipoEnvase=" + tipoEnvase + ", descuento=" + descuento + "]";
    }
}
