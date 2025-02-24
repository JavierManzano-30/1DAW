import java.util.Scanner;
public class DelUnoAlN
{
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);
    System.out.println("Hasta que número quieres que cuente: ");
    int numeroUsuario = sc.nextInt();
    int indice = 1;

    while(indice <= numeroUsuario)
    {
      System.out.println(indice);
      indice++;
    }
    sc.close();
  }
}