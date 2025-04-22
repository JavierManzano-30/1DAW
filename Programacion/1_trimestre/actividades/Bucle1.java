public class Bucle1
{
  public static void main(String[] args)
  {
    //for(int indice = 0; indice <= 10; indice++)
    //{
    //  System.out.println("Iteración: " + indice + "/10.");
    //}

    int suma = 0;
    for(int indice = 1; indice <= 100; indice++)
    {
      suma += indice;
    }
    System.out.println("la suma es: " + suma);
  }
}