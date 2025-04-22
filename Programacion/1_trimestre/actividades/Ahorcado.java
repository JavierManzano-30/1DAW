import java.util.Scanner;
public class Ahorcado
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame la palabra secreta:");
    String palabraSecreta = sc.nextLine();
    int numeroIntentos = 7;
    String letrasAdivinadas = "";

    for(int i = 0; i < palabraSecreta.length(); i++)
    {
      char letra = palabraSecreta.charAt(i);

      if(letrasAdivinadas.indexOf(letra) >= 0)
      {

      }
      else
      {
        System.out.print("_ ");
      }
    }
    System.out.println();

    System.out.print("Introduce una letra: ");
    String letraIntento = sc.nextLine();
    if(letrasAdivinadas.indexOf(letraIntento) >= 0)
    {
      System.out.print("Ya has adivinado esta letra.");
    }
    else
    {
      for(int i = 0; i < palabraSecreta.length(); i++)
      {
        String letraPalabraSecreta = String.valueOf(palabraSecreta.charAt(i));
        if(letraPalabraSecreta.equals(letraIntento))
        {
          letraEncontrada = true;
        }
      }
    }

  }
}