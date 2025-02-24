import PersonaCamiseta.Camiseta;


public class Persona {

    public String name;
    public Camiseta camiseta;

    public Persona(
            String name,
            Camiseta camiseta ){

        this(name);
        this.camiseta = camiseta;
    }

    public Persona(String name) {
        this.name = name;
    }

    public void PonerseCamiseta(Camiseta camiseta) {
        System.out.println(this.name + " se ha puesto una camiseta " + camiseta.getColor());
        this.camiseta = camiseta;
    }

    public Camiseta quitarseCamiseta() {
        Camiseta camisetaQuitada = this.camiseta;
        this.camiseta = null;
        return camisetaQuitada;
    }

    @Override 
    public String toString(){
        if(camiseta == null) return this.name + " está desnudo.";
        return this.name + " lleva puesta una camiseta de " + this.camiseta.getMarca() + " de talla " + this.camiseta.getTalla() + " de color " + this.camiseta.getColor();
    } 

}  