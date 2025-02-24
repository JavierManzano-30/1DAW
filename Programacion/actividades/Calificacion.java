import java.util.Scanner;
public class Calificacion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la nota del alumno:");
        int numeroUsuario = sc.nextInt();

        if(numeroUsuario < 5)
        {
            System.out.println("La nota del alumno es un insuficiente.");
        } 
        else
        {
            if(numeroUsuario == 5)
            {
                System.out.println("La nota del alumno es un suficiente.");
            }
            else
            {
                if(numeroUsuario == 6)
                {
                    System.out.println("La nota del alumno es un bien.");
                }
                else
                {
                    if(numeroUsuario ==7 || numeroUsuario ==8)
                    {
                        System.out.println("La nota del alumno es un notable.");
                    }
                    else
                    {
                        if(numeroUsuario ==9 || numeroUsuario ==10)
                        {
                            System.out.println("La nota del alumno es un sobresaliente.");
                        }
                    }
                }
            }
        }
    }
}