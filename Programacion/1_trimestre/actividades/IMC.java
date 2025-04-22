import java.util.Scanner;
public class IMC {
    public static void main(String[] args){
        double peso, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuánto pesas?:");
        peso = sc.nextDouble();

        System.out.println("¿Cuánto eres de alto?:");
        altura = sc.nextDouble();
        double IMC = peso / Math.pow(altura, 2);

        System.out.println("Tu IMC midiendo " + altura + "metros y pesando " + peso + "kg es de " + IMC);
    }
}