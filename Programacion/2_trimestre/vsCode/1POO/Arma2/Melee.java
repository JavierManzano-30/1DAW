public class Melee {
    public String nombre;
    public int danyo;
    public int tamanio;
    public int desgaste;

    public Melee(String nombre, int danyo, int tamanio, int desgaste) {
        this.nombre = nombre;
        this.danyo = danyo;
        this.tamanio = tamanio;
        this.desgaste = desgaste;
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

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }
    
    
}
