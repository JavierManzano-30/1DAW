import java.util.Scanner;
public class TablaMultiplicar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el número: ");
        int numero = sc.nextInt();

        for(int indice = 1; indice <= 10; indice++)
        {
            System.out.println(numero + " x " + indice + " = " + (numero * indice));
        }

    }
}