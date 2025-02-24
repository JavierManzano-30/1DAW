import PersonaCamiseta.Camiseta;    

public class Main {
    public static void main(String[] args) {
        Camiseta camiseta = new Camiseta("Lacoste", "L", "Azul");
        System.out.println(camiseta);
        Persona persona = new Persona("Juan");
        System.out.println(persona);
        persona.PonerseCamiseta(camiseta);
        System.out.println(persona);
        persona.quitarseCamiseta();
        System.out.println(persona);
    }
}