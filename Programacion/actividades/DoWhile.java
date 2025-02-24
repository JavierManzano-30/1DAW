import java.util.Random;
public class DoWhile
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int numero;
    int intentos = 0;
    
    do
    {
      numero = rand.nextInt(100) + 1;
      System.out.println("Numero generado es: " + numero);

      intentos++;
    } while (numero % 5 != 0);

    System.out.println("El número múltiplo de 5 ha sido: " + numero + " después de " + intentos + " intentos.");
  }
}    