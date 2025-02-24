package array;
import java.util.Scanner;

public class ArrayPrimeroUltimo {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        Scanner console = new Scanner(System.in);
        int[] numeros = new int[N];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        for(int i = 0; i < numeros.length / 2; i++){
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[numeros.length - 1 - i] + " ");
        }
        
        console.close();
    }
}
