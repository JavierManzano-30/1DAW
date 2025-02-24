import java.util.Scanner;
public class Esfera {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Dame el radio: ");
    double radio = sc.nextDouble();

    double perimetro = 2 * Math.PI * radio;
    double area = 4 * Math.PI * Math.pow(radio, 2);
    double volumen = 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);

    System.out.printf("El perimetro es: %.2f m \n", perimetro);
    System.out.printf("El area es: %.2f m2 \n", area);
    System.out.printf("El volumen es: %.2f m3 \n", volumen);

    sc.close();
    }
}