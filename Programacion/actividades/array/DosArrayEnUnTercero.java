package array;
public class DosArrayEnUnTercero {
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4};
        int[] numeros2 = new int[numeros.length];
        int[] numeros3 = new int[numeros.length];

        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = numeros[i]*10;
        }

        for (int i = 0; i < numeros3.length; i++) {
            numeros3[i] = numeros[i] + numeros2[i];
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
            
        }
    }
}
