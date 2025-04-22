package array;

import java.util.Arrays;

public class RotaNVeces {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        final int N = Integer.parseInt(args[0]);
        
        System.out.println(Arrays.toString(numeros));
        for(int j = 0; j < N; j++){
            int temp = numeros[numeros.length-1];
            for(int i = numeros.length - 1; i >= 1; i--){
                numeros[i] = numeros[i-1];
            }
            numeros[0] = temp;
            System.out.println(Arrays.toString(numeros));
        }


    }
}
