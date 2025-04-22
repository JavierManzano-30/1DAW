import java.util.Scanner;
public class TotalHoras {
    public static void main(String[] args)
    {
    final int numeroHorasEnUnaSemana = 168;
    final int numeroHorasEnUnDia = 24;
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime las horas:");
    int totalHoras = sc.nextInt();

    int semanas = totalHoras / numeroHorasEnUnaSemana;
    int horasRestantes = totalHoras % numeroHorasEnUnaSemana;
    int dias = horasRestantes / numeroHorasEnUnDia;
    int horas = horasRestantes % numeroHorasEnUnDia;

    System.out.println(semanas + " semanas");
    System.out.println(dias + " dias");
    System.out.println(horas + " horas");
    }
}