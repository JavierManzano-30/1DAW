import java.util.Scanner;
public class PalindromoPrueba {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que palabra quieres saber si es palíndromo:");
        String palabra = sc.nextLine();

        int longitudPalabra = palabra.length();
        for(int indice = 0; indice < palabra.length(); indice++)
        {
            
            System.out.println("La palabra " + (char)indice);
        }
        sc.close();
    }
}