import java.util.Scanner;

public class hundirLaFlota {

    // TABLEROS 
    static int[][] tableroJugador1 = new int[5][5];
    static int[][] tableroJugador2 = new int[5][5];
    static boolean[][] ataquesJugador1 = new boolean[5][5];
    static boolean[][] ataquesJugador2 = new boolean[5][5];

    public static void main(String[] args) {

        // MENU
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean juegoContinua = false;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Configurar Tableros");
            System.out.println("2. Mostrar Tableros");
            System.out.println("3. Jugar");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    configurarTablero(sc);
                    juegoContinua = true;
                    break;
                case 2:
                    mostrarTableros();
                    break;
                case 3:
                    if (juegoContinua) {
                        jugar(sc);
                    } else {
                        System.out.println("Configura los tableros!");
                    }
                    break;
                case 4:
                    System.out.println("Juego Terminado. Adio!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion
                != 4);
    }

    public static void configurarTablero(Scanner sc) {//parametros
        System.out.println("\nJugador 1, Configura tu tablero:");
        colocarBarcos(tableroJugador1, sc);

        System.out.println("\nJugador 2, Configura tu tablero:");
        colocarBarcos(tableroJugador2, sc);

    }

    public static void colocarBarcos(int[][] tablero, Scanner sc) {
        int controlador = 2; // Numero de barcos

        int fila, columna;
        for (int i = 0; i < controlador; i++) {
            do {
                System.out.println("Dime la fila(0-4) y columna(0-4) del barco " + (i + 1) + ": ");
                fila = sc.nextInt();
                columna = sc.nextInt();
            } while (fila < 0 || fila > 4 || columna < 0 || columna > 4 || tablero[fila][columna] == 1);
            tablero[fila][columna] = 1;
        }
    }

    private static void mostrarTableros() {
        System.out.println("\n Tablero J1: ");
        mostrarTablero(tableroJugador1);
        System.out.println("\n Tablero J2: ");
        mostrarTablero(tableroJugador2);
    }

    public static void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 1) {
                    System.out.print("~ ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void jugar(Scanner sc) {
        boolean winner = false;
        while (!winner) {
            winner = turnoDeJugadores(sc, tableroJugador2, ataquesJugador1, "Jose");
            if (winner) {
                break;
            }
            winner = turnoDeJugadores(sc, tableroJugador1, ataquesJugador2, "Manzano");
        }
    }

    public static boolean turnoDeJugadores(Scanner sc, int[][] tablero, boolean[][] ataques, String jugador) {
        int fila, columna;
        System.out.println("\nLe toca al jugador " + jugador);
        do {
            System.out.print("Dime la fila(0-4) y columna(0-4) del barco: ");
            fila = sc.nextInt();
            columna = sc.nextInt();
        } while (fila < 0 || fila > 4 || columna < 0 || columna > 4 || ataques[fila][columna]);

        ataques[fila][columna] = true;
        if (tablero[fila][columna] == 1) {
            System.out.println("Barco hundido!");
            tablero[fila][columna] = 0; // Actualiza el tablero para marcar el barco como hundido
            if (juegoTerminado(tablero)) {
                System.out.println("El jugador " + jugador + " ha ganado!");
                return true;
            }
        } else {
            System.out.println("Agua");
        }

        return false;
    }

    public static boolean juegoTerminado(int[][] tablero) {
        for (int[] fila : tablero) {
            for (int celda : fila) {
                if (celda == 1) {
                    return false;
                }
            }
        }
        return true;
    }

}