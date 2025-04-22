import java.util.Scanner;
public class ConvertirDolarAEuro
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dolar:");
        double dolar = sc.nextInt();

        double euro = 0.91;

        System.out.println("A euro es:" + dolar * euro);

        sc.close();
    }
}    