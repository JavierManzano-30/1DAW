package array;

import java.util.Arrays;

public class ElUltimoAlPrimero {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int numerito = numeros[9];

        for(int i = numeros.length - 1; i >= 1; i--){
            numeros[i] = numeros[i-1];
        }

        numeros[0] = numerito;

        System.out.println(Arrays.toString(numeros));
    }
}
