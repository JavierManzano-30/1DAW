import lib.funciones;

public class JavierManzanoOliveros_ExamenFinal1Trimestre {
    public class Datos {

    public static void main(String[] args) {
        // MENU
        funciones.menu();
        
        int[] coordenadas = { 123, 450, 7890 };
        //1. Decodificación de coordenadas alienígenas
        funciones.decodificarCoordenadas(int[] coordenadas);

        //2. Sistema de alerta temprana
        funciones.esCiclico(final int[] patron = { 2, 3, 4, 2, 3, 4, 2, 3, 4 }, final int longitudCiclo = 3);

        //3. Evacuación de civiles
        funciones.contarZonasSeguras(int[][] terreno = 
        {
                {1, 1, 1, 0, 1},
                {1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        });
        
    }
}