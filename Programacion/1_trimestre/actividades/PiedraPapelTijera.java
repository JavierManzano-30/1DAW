import java.util.*;
public class PiedraPapelTijera{
  public static void main(String[] args){
    
    final int piedra = 1;
    final int papel = 2;
    final int tijera = 3;

    Scanner sc = new Scanner(System.in);

    String mensaje = "Elige una opcion: \n" +
    "1. Piedra\n" +
    "2. Papel\n" +
    "3. Tijera";
    System.out.println(mensaje);

    Random rand = new Random();
    int opcionUsuario = sc.nextInt();
    int opcionMaquina = rand.nextInt(3) + 1;
    String salida = "";
    int contadorUsuario = 0;
    int contadorMaquina = 0;

    while(!salida.toUpperCase().equals("N"))
    {
      if(opcionUsuario == piedra)
      {
        System.out.println("Usuario ha elegido: Piedra.");
      }
      else if(opcionUsuario == papel)
      {
        System.out.println("Usuario ha elegido: Papel.");
      }
      else
      {
        System.out.println("Usuario ha elegido: Tijera.");
      }

      if(opcionMaquina == piedra)
      {
        System.out.println("Maquina ha elegido: Piedra.");
      }
      else if(opcionMaquina == papel)
      {
        System.out.println("Maquina ha elegido: Papel.");
      }
      else
      {
        System.out.println("Maquina ha elegido: Tijera.");
      }

      if(opcionUsuario == opcionMaquina)
      {
        System.out.println("Ha sido un empate.");
      }
      else if((opcionUsuario == piedra && opcionMaquina == tijera)
      || (opcionUsuario == papel && opcionMaquina == piedra)
      || (opcionUsuario == tijera && opcionMaquina == papel))
      {
        System.out.println("El usuario ha ganado.");
      }
      else
      {
        System.out.println("La maquina ha ganado.");
      }
    

    }
    sc.close();
  }
}