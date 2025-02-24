package array;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarUnaPosicion {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);

        System.out.println(Arrays.toString(numeros));
        
        // * 1. Pedir posición al usuario.
        System.out.print("Dime que posición quieres eliminar: ");
        int posicionEliminar = Integer.parseInt(sc.nextLine()) - 1;

        int numeroAMover = numeros[posicionEliminar];

        // * 2. Desplazar los números a la izquierda hasta la posición ordenada.
        if(posicionEliminar < numeros.length && posicionEliminar > 0){
            for (int i = posicionEliminar; i < numeros.length - 1; i++) {
                numeros[i] = numeros[i+1];
            }
            
            
            
            
            //for (int i = 0; posicionEliminar < numeros.length; i++) {
                //    numeros[posicionEliminar] = numeros[i+1];
                //}
                
            // * 3. Rellenar con un 0 la última posición.
            numeros[numeros.length - 1] = numeroAMover;
        }

        System.out.println(Arrays.toString(numeros));

        sc.close();
    }
}
