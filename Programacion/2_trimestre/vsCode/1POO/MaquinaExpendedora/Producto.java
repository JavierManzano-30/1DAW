public class Producto {
    private String nombre;
    private double precio;
    private int calorias;
    private boolean caducado;

    public Producto(String nombre, double precio, int calorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.caducado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean getCaducado() {
        return caducado;
    }

    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }

    public void aplicarDescuento (double porcentaje) {
        if(porcentaje > 0 && porcentaje <= 100) {
            double descuento = (getPrecio() * porcentaje) / 100;

            double precioDescuentoAplicado = getPrecio() - descuento;

            setPrecio(precioDescuentoAplicado);
        }
    }

    public boolean esMasBaratoQueOtro (Producto otroProducto) {
        return this.getPrecio() < otroProducto.getPrecio();
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", calorias=" + calorias + ", caducado=" + caducado + "]";
    }
}