public class Atraccion {

    public String nombre;
    public String zona;
    public double alturaMinima;
    public int edadMinima;
    public boolean enFuncionamiento;
    public boolean requireVip;
    public int capacidadMaxima;
    public int aforoActual;

    public Atraccion(String nombre, String zona, double alturaMinima, int edadMinima, boolean enFuncionamiento,
            boolean requireVip, int capacidadMaxima, int aforoActual) {
        this.nombre = nombre;
        this.zona = zona;
        this.alturaMinima = alturaMinima;
        this.edadMinima = edadMinima;
        this.enFuncionamiento = enFuncionamiento;
        this.requireVip = requireVip;
        this.capacidadMaxima = capacidadMaxima;
        this.aforoActual = aforoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public boolean isEnFuncionamiento() {
        return enFuncionamiento;
    }

    public void setEnFuncionamiento(boolean enFuncionamiento) {
        this.enFuncionamiento = enFuncionamiento;
    }

    public boolean isRequireVip() {
        return requireVip;
    }

    public void setRequireVip(boolean requireVip) {
        this.requireVip = requireVip;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getAforoActual() {
        return aforoActual;
    }

    public void setAforoActual(int aforoActual) {
        this.aforoActual = aforoActual;
    }

    @Override
    public String toString() {
        return "Atraccion [nombre=" + nombre + ", zona=" + zona + ", alturaMinima=" + alturaMinima + ", edadMinima="
                + edadMinima + ", enFuncionamiento=" + enFuncionamiento + ", requireVip=" + requireVip
                + ", capacidadMaxima=" + capacidadMaxima + ", aforoActual=" + aforoActual + "]";
    }

    public boolean puedeSubirse(Visitante v) {
        boolean puede = false;
        if (zona == "Zona de Aventuras" && v.altura > 2.00) {
            return puede;
        } else if (requireVip == true && v.esVip == false) {
            return puede;
        } else if ((aforoActual) - 1 > capacidadMaxima) {
            return puede;
        } else if (enFuncionamiento = true && (v.altura) - 1 > alturaMinima && (v.edad) - 1 > edadMinima) {
            puede = true;
        }
        return puede;
    }

    public boolean abrir() {
        boolean cerrado = true;
        if (enFuncionamiento == false) {
            return cerrado;
        }
        return cerrado;
    }

    public boolean cerrar() {
        boolean abierto = false;
        if (enFuncionamiento == true) {
            return abierto;
        }
        return abierto;
    }

    public String mostrarEstado() {
        return "Nombre de atracción: " + this.nombre + "| Zona: " + this.zona + "| Estado: " + abrir()
                + "| Requisitos edad: " + puedeSubirse(null) + "| Altura: " + this.alturaMinima + "| Aforo actual: "
                + this.aforoActual;
    }

    public void registrarSubida() {
        if (aforoActual < capacidadMaxima) {
            aforoActual++;
        }
    }

    public void reiniciarAforo() {
        aforoActual = 0;
    }
}
