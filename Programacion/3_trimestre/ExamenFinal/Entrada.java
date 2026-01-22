public class Entrada extends Visitante {

    public Entrada(String nombre, int edad, double altura, boolean esVip, String provinciaOrigen) {
        super(nombre, edad, altura, esVip, provinciaOrigen);
    }

    public TipoEntrada tipoEntrada;
    public double precio;

    public Entrada(String nombre, int edad, double altura, boolean esVip, String provinciaOrigen,
            TipoEntrada tipoEntrada, double precio) {
        super(nombre, edad, altura, esVip, provinciaOrigen);
        this.tipoEntrada = tipoEntrada;
        this.precio = precio;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Entrada [tipoEntrada=" + tipoEntrada + ", precio=" + precio + "]";
    }

    public double calcularPrecio() {
        int precio = 0;
        if (esVip) {
            return precio;
        } else if (this.edad < 12 && this.altura < 1.20) {
            precio = 10;
        } else if (this.edad < 12 && this.altura > 1.20) {
            precio = 15;
        } else if (this.edad > 11 && this.edad < 18) {
            precio = 20;
        } else if (this.edad > 17) {
            precio = 25;
        }
        return precio;
    }

    public boolean esTipoValido(TipoEntrada tipoEntrada) {
        boolean esVerdad = true;
        switch (tipoEntrada) {
            case INFANTIL:
                if (this.edad < 12 && this.altura < 1.40) {
                    return esVerdad;
                }
                break;
            case GENERAL:
                if (this.edad > 11 && this.altura > 1.40 && esVip == false) {
                    return esVerdad;
                }
                break;
            case VIP:
                if (esVip) {
                    return esVerdad;
                }
                break;
        }
        return esVerdad;
    }

    public String resumenEntrada() {
        return "Nombre: " + this.nombre + "| Edad: " + this.edad + "| Tipo: " + this.tipoEntrada + "| Provincia: "
                + this.provinciaOrigen + "| Precio: " + calcularPrecio();
    }
}
