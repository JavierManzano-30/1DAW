import java.util.ArrayList;

public class Mochila {
    private String marca;
    private String color;
    private ArrayList<Objeto> objetos;
    private int capacidad;

    public Mochila(String marca, String color, ArrayList<Objeto> objetos, int capacidad) {
        this.marca = marca;
        this.color = color;
        this.objetos = objetos;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return "Mochila [marca=" + marca + ", color=" + color + ", objeto=" + objetos + ", capacidad=" + capacidad + "]";
    }


}
