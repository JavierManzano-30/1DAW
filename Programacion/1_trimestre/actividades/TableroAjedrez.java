public class TableroAjedrez{
    public static void main(String[] args){
        final int tamanyo = 8;

        for(int fila = 0; fila < tamanyo; fila++){
            for(int columna = 0; columna < tamanyo; columna++){
                if((fila + columna) % 2 == 0){
                    System.out.print("  ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}