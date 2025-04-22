package array;

import java.util.Scanner;

public class DNI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 
        'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
        'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.print("Introduzca DNI sin letra: ");


        int numeroDNI = sc.nextInt();
        int resto = numeroDNI % letrasDNI.length;

        char letraDNI = letrasDNI[resto];

        System.out.println("Su DNI es " + numeroDNI + " - " + letraDNI);
        sc.close();
    }
}
