import java.util.*;

public class CuboArray {
    public static void main(String[] args) {
        System.out.print("¿De que tamaño es el cubo?: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][][] array = new int[N][N][N];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[0][i][j] = 1;
                array[array.length][i][j] = 1;
            }
        }

        for (int i = 1; i < array.length-1; i++) {
            for (int k = 0; k < array.length; k++) {
                array[i][0][k] = 2;
                array[i][array.length][k] = 2;
            }

            for (int j = 1; j < array.length; j++) {
                array[i][j][0] = 3;
                array[i][j][array.length] = 3;

                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = 0;
                }
            }
        }


        sc.close();
    }
}
