package array;
import java.util.Scanner;

public class NInverso {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        Scanner console = new Scanner(System.in);
        int[] numeros = new int[N];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce un número: ");
            numeros[i] = console.nextInt();
        }

        for(int i = numeros.length-1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
        console.close();
    }
}
