import java.util.Scanner;
public class NumeroDigitos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número maricón: ");
        int numero = sc.nextInt();

        int numDigitos = 1;
        
        while(numero > 10){
            numDigitos++;

            numero = numero / 10;
        }

        System.out.println("El número de dígitos es: " + numDigitos);
        
        sc.close();
    }
}