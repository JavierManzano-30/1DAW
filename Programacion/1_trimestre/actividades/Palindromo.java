import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que palabra quieres saber si es palíndromo:");
        String palabra = sc.nextLine();

        boolean esPalindromo = true;
        int longitudPalabra = palabra.length();
        for(int indice = 0; indice < palabra.length() / 2; indice++)
        {
            if(palabra.charAt(indice) != palabra.charAt(longitudPalabra - indice - 1))
            {
                esPalindromo = false;
                break;
            }
        }
        if(esPalindromo)
        {
            System.out.println("La palabra " + palabra + " es un palindromo");
        }
        else
        {
            System.out.println("La palabra " + palabra + " no es un palindromo");
        }

        sc.close();
    }
}