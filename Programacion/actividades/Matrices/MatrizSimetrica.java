public class MatrizSimetrica {
    public static void main(String[] args) {
        /* MATRIZ A
         * 
         * 1 2 3
         * 2 4 5
         * 3 5 6
         * 
         * MATRIZ TRANSPUESTA A
         * 
         * 1 2 3 
         * 2 4 5
         * 3 5 6
         * 
         * 
         *  8 9 2
         *  1 0 6
         *  5 2 8
         * 
         *  8 1 5
         *  9 0 2
         *  2 6 8
         */

        int[][] matriz = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

        boolean esSimetrica = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] != matriz[j][i]){
                    esSimetrica = false;
                    break;
                }
            }

            if(!esSimetrica){
                break;
            }
        }

        if(esSimetrica){
            System.out.println("La matriz es simétrica.");
        }else{
            System.out.println("La matriz no es simétrica.");
        }
        
    }
}
