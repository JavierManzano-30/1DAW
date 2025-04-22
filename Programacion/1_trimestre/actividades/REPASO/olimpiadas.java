public class olimpiadas {

    public static void menu() {
        // Imprimir las opciones del menu
        System.out.println("Bienvenido al programa, seleccione una opción:");
        System.out.println("\t1) Registrar atleta");
        System.out.println("\t2) Ver máximo de atleta");
        System.out.println("\t3) Ver ganadores");
        System.out.print("Opción elegida: ");
    }
    
    public static String[][] regsitrarAtleta(String[][] atletas, String[] nuevoAtleta) {
        // Añadir atleta al array
        System.out.println("registrarAtleta");
        return atletas;
    }

    public static double calcularMaxAtleta(String[] atleta) {
        // Calcular el record máximo de atleta
        System.out.println("calcularMaxAtleta");
        return 0;
    }

    public static String[] calcularGanadores(String[][] atletas) {
        String[] ganadores = new String[3];
        // Devolver en orden los 3 ganadores
        System.out.println("calcularGanadores");
        return ganadores;
    }

    static void main(String args[]) {
        /* 1.Menú
         * 2.Registrar atleta
         * 3.Calcular media atleta
         * 4.Calcular ganadores(MAX)
         */

        // Impresión del menu
        menu();
        

    }
}