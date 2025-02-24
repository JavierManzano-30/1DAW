import java.util.Arrays;
import java.util.Scanner;

public class MatrizMarco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el tamaño de la matriz:");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        String matrizPintada = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == 0){
                    matriz[i][j] = 1;
                }
                else if(j == 0){
                    matriz[i][j] = 1;
                }
                else if(matriz[i] == matriz[j] && matriz[j] == matriz[i]){
                    matriz[i][j] = 1;
                }
                else
                {
                    matriz[i][j] = 0;
                }
            }

            matrizPintada += Arrays.toString(matriz[i]) + "\n";
        }

        System.out.println(matrizPintada);
        
        sc.close();
    }
}
