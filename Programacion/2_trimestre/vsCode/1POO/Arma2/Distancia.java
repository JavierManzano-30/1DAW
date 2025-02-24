public class Distancia {
    public String nombre;
    public int danyo;
    public int rango;
    public int municion;
    public int capacidad;

    public Distancia(String nombre, int danyo, int rango, int municion, int capacidad) {
        this.nombre = nombre;
        this.danyo = danyo;
        this.rango = rango;
        this.municion = municion;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanyo() {
        return danyo;
    }

    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
