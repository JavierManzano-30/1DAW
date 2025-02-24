public class Arma {
    public String name;
    public String category;
    public String color;
    public double alcance;
    public int cadencia;
    public int danio;
    public String empuniadura;
    public boolean equipada;

    public Arma(String name, String category, String color, double alcance, int cadencia, int danio, String empuniadura, boolean equipada){
        this.name = name;
        this.category = category;
        this.color = color;
        this.alcance = alcance;
        this.cadencia = cadencia;
        this.danio = danio;
        this.empuniadura = empuniadura;
        this.equipada = equipada;
    }

    public Arma(String name, int danio){
        this(name, danio, 0, 0, null, false);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDanio(){
        return this.danio;
    }

    public void setDanio(int danio){
        this.danio = danio;
    }

    public double getAlcance(){
        return this.alcance;
    }

    public void setAlcance(double alcance){
        this.alcance = alcance;
    }

    public boolean isEquipada(){
        return this.equipada;
    }

    public void setequipada(boolean equipada){
        this.equipada = equipada;
    }
}
