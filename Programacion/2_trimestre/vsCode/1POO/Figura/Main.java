import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 6);
        Figura circulo = new Circulo(3);
        
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(rectangulo);
        figuras.add(circulo);

        for (Figura figura : figuras) {
            figura.ImprimirDetalle();
            System.out.println("--------------------");
        }

        System.out.println(rectangulo.CalcularArea());
        System.out.println(rectangulo.CalcularPerimetro());
        System.out.println(circulo.CalcularArea());
        System.out.println(circulo.CalcularPerimetro());
    }
}