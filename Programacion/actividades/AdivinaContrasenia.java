import java.util.Scanner;
public class AdivinaContrasenia
{
  public static void main(String[] args)
  {
    String password = "Lunes";
    Scanner sc = new Scanner(System.in);
    String contrasenia;

    do
    {
        System.out.println("Dime la contraseña: ");
        contrasenia = sc.nextLine();
         if(!password.equals(contrasenia))
         {
            System.out.println("Contraseña incorrecta, repite la contraseña:");
         }
        
    }while (!password.equals(contrasenia));
    
    System.out.println("Contraseña correcta.");

    sc.close();
  }
}    