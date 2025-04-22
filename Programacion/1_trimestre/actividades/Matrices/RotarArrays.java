import java.util.Arrays;
import java.util.Scanner;

public class RotarArrays {
    public static void main(String[] args) {
        
        String[] array = { "Uno", "Dos", "Tres", "Cuatro", "Cinco" };

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas veces va a rotar");
        int rotaciones = sc.nextInt();

        System.out.println(Arrays.toString(array));
        System.out.println();

        //Rotamos tantas veces como quiera el cliente
        for (int i = 0; i < rotaciones; i++) {
            //Guardamos el primer valor para no machacarlo
            String temporal = array[0];

            //Desplazamos para el lado toda la array
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            //Sustituimos el primer valor salvado y lo ponemos el ultimo
            array[array.length - 1] = temporal;
        }

        System.out.println("Array despues de " + rotaciones + " rotaciones hacia la izquierda");

        System.out.println(Arrays.toString(array));

        sc.close();
    }
}
