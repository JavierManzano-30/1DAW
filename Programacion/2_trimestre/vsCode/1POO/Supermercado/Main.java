import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Detergente fairi = new Detergente("Fairi", 4, 2456, 54, "Cuadrado", 50);

        double fairiConDescuento = fairi.getPrecioDescuento(50);

        System.out.println(fairiConDescuento);

        Cereal chocapriskis = new Cereal("Chokapicks", 5, 1234, "Avena", LocalDate.of(2026, 5, 30));

        System.out.println(chocapriskis.getCalorias());

        Vino vino = new Vino("Alto de valdoso", 25, 987, "Dulce", 13, 1995);

        if(vino.esDeAltaGama()){
            System.out.println("El vino " + vino.getMarca() + " es de gama alta");
        }else{
            System.out.println("No es de gama alta");
        }
        
        if (vino.esVinoDulce()) {
            System.out.println("El vino " + vino.getMarca() + " es un vino dulce");
        }else {
            System.out.println("No es un vino dulce");
        }
    }
}