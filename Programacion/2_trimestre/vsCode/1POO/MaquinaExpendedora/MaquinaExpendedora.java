import java.util.Arrays;

public class MaquinaExpendedora {
    private boolean disponible;
    private Producto[] productos;
    private boolean pagoConTarjeta;
    private double saldoMaquina;

    public MaquinaExpendedora(boolean pagoConTarjeta, int capacidadProductos) {
        this.pagoConTarjeta = pagoConTarjeta;

        this.disponible = true;
        this.productos = new Producto[capacidadProductos];
        this.saldoMaquina = 0;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public boolean getPagoConTarjeta() {
        return pagoConTarjeta;
    }

    public void setPagoConTarjeta(boolean pagoConTarjeta) {
        this.pagoConTarjeta = pagoConTarjeta;
    }

    public double getSaldoMaquina() {
        return saldoMaquina;
    }

    public void setSaldoMaquina(double saldoMaquina) {
        this.saldoMaquina = saldoMaquina;
    }

    public void insertarDinero(double cantidad) {
        if(cantidad > 0) {
            saldoMaquina += cantidad;
        }
    }

    public void reponerProducto(Producto productoAReponer) {
        for (int i = 0; i < getProductos().length; i++) {
            if(getProductos()[i] == null) {
                getProductos()[i] = productoAReponer;
                break;
            }
        }
    }

    public void comprarProducto(Producto producto) {
        if(getDisponible() && getSaldoMaquina() >= producto.getPrecio()) {
            saldoMaquina -= producto.getPrecio();
        }
    }

    @Override
    public String toString() {
        return "MaquinaExpendedora [disponible=" + disponible + ", productos=" + Arrays.toString(productos)
                + ", pagoConTarjeta=" + pagoConTarjeta + "]";
    }

}
