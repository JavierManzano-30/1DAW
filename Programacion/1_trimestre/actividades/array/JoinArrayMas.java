package array;

public class JoinArrayMas {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] numeros2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
        int[] numeros3 = new int[numeros.length + numeros2.length];

        for (int i = 0; i < numeros.length; i += N) {
            for(int j = 0; j < N; j++){
                numeros3[i*2+j] = numeros[i+j];
                
                numeros3[i*2+N+j] = numeros2[i+j];
            }
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i] + " ");
        }
    }
}