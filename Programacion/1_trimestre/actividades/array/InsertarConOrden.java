package array;

import java.util.*;

public class InsertarConOrden {
    public static void main(String[] args) {
        int[] numeros = { 1, 3, 5, 7, 9, 0, 0, 0, 0, 0 };

        //1-Pedir o generar número
        final int N = Integer.parseInt(args[0]);
        
        //2-Encontrar indice donde insertar
        int posicion = -1;

        for(int i = 0; i < numeros.length && posicion == -1; i++){
            if(N < numeros[i] || numeros[i] == 0){
                posicion = i;
                break;
            }
        }
        //3-Rotar los valores para hacer espacio para el nuevo valor
        for(int i = numeros.length - 1; i > posicion; i--){
            numeros[i] = numeros[i-1];
        }

        //4-Insertar nuevo valor en la posición indicada
        numeros[posicion] = N;

        System.out.println(Arrays.toString(numeros));
        
    }
}
