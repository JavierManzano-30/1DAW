import java.util.*;

public class ArrayBidimensional {

    public static void main(String[] args) {
        String[][] tabla = new String[5][8];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = "(" + i + "," + j + ")";
            }
            System.out.println();

            System.out.println(Arrays.toString(tabla[i]));
        }
    }
}