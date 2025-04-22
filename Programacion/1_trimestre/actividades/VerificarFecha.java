import java.util.Scanner;
public class VerificarFecha
{
  public static void main(String[] args)
  {
    int dia, mes, anyo;
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Dime el día?:");
    dia = sc.nextInt();
    System.out.println("¿Dime el mes?:");
    mes = sc.nextInt();
    System.out.println("¿Dime el año?:");
    anyo = sc.nextInt();

    if(dia <= 0 || dia >= 32)
    {
      System.out.println("Esta fecha es incorrecta.");
    }
    else
    {
      if(mes <= 0 || mes >= 13)
      {
        System.out.println("Esta fecha es incorrecta.");
      }
      else
      {
        if(anyo <= 1950 || anyo >= 2024)
        {
          System.out.println("Esta fecha es incorrecta.");
        }
        else
        {
          System.out.println("Esta fecha es correcta.");
        }
      }
    }
  }
}