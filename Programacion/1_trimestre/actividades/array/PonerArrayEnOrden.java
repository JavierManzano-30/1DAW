package array;

public class PonerArrayEnOrden {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        int[] numeros2 = {10, 20, 30, 40};
        int[] numeros3 = new int[numeros.length + numeros2.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros3[i*2] = numeros[i];
            numeros3[i*2+1] = numeros2[i];
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i] + " ");
        }
    }
}
