package array;

import java.util.*;

public class DesplazarArray {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 0 };

        final int N = Integer.parseInt(args[0]);

        for(int i = numeros.length - 1; i >= 1; i--){
            numeros[i] = numeros[i-1];
        }

        numeros[0] = N;
        System.out.println(Arrays.toString(numeros));
        
    }
}

