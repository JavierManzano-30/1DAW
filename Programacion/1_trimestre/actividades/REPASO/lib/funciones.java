package lib;

import java.util.Scanner;

public class funciones{

	public static Object menu;

	public static String texto(){
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		return texto;
	}

	public static String texto(String info){
		System.out.print(info);
		return texto();
	}

	public static int entero(){
		int numero;
		try{
			numero = Integer.parseInt(texto());
		}catch(Exception e){
			numero = entero("Introduzca un numero valido: ");
		}
		return numero;
	}

	public static int entero(String info){
		System.out.print(info);
		return entero();
	}

    public class Ejercicios 
{
	/**
	 * Función que imprime los programas disponibles y devuelve la opción elegida
	 * @return opción elegida
	 */
	public static int menu() 
	{
		int sc = entero();
		int opcion;
		boolean juegoContinua = false;

        do {
            System.out.println("\n=== DEFENDIENDO LA TIERRA DE UNA INVASIÓN ALIENÍGENA ===");
            System.out.println("1. Decodificación de coordenadas alienígenas");
            System.out.println("2. Sistema de alerta temprana");
            System.out.println("3. Evacuación de civiles");
            System.out.println("4. Decodificación de energía alienígena");
            System.out.println("5. Salir");
            System.out.print("Introduce una opción: ");

            switch (opcion) {
                case 1:
					decodificarCoordenadas();
                    break;
                case 2:
					esCiclico();
                    break;
                case 3:
					contarZonasSeguras();
                    break;
                case 4:
					calcularPatronEnergetico();
                    break;
                case 5:
                    System.out.println("Juego Terminado. Adiós!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 5);
    
		return opcion;
	}

	
	 /**
	  * 1. Decodificación de coordenadas alienígenas
	  * @param coordenadas
	  * @return
	  */
	 public static int[] decodificarCoordenadas(int[] coordenadas) {
		// Aquí las convierto cada parte del array en String
		String numCadena1= Integer.toString(coordenadas[0]);
		String numCadena2= Integer.toString(coordenadas[1]);
		String numCadena3= Integer.toString(coordenadas[2]);

		// Aquí les doy la vuelta en forma de String y las guardo en otra variable en forma de int
		String cadenaInvertida1 = "";
		int indice = numCadena1.length() - 1;
		while (indice >= 0)
		{
			cadenaInvertida1 += numCadena1.charAt(indice);
			indice--;
		}
		int cadenaInvertida11 = Integer.parseInt(cadenaInvertida1);

		String cadenaInvertida2 = "";
		int i = numCadena2.length() - 1;
		while (i >= 0)
		{
			cadenaInvertida2 += numCadena2.charAt(i);
			i--;
		}
		int cadenaInvertida22 = Integer.parseInt(cadenaInvertida2);

		String cadenaInvertida3 = "";
		int j = numCadena3.length() - 1;
		while (j >= 0)
		{
			cadenaInvertida3 += numCadena3.charAt(j);
			j--;
		}
		int cadenaInvertida33 = Integer.parseInt(cadenaInvertida3);

		// Meto los int en una nueva array final en forma de int
		int[] coordenadasFinal = {cadenaInvertida11, cadenaInvertida22, cadenaInvertida33};

			return coordenadasFinal;
		}

    /**
	 * 2. Sistema de alerta temprana
	 * @param patron
	 * @param longitudCiclo
	 * @return
	 */
    public static boolean esCiclico(int[] patron, int longitudCiclo) {
		if()


        return true;
    }

    /**
	 * 3. Evacuación de civiles
	 * @param terreno
	 * @return
	 */
    public static int contarZonasSeguras(int[][] terreno) {
		return 0;
    }

    /**
	 * 4. Decodificación de energía alienígena
	 * @param n
	 * @return
	 */
    public static int calcularPatronEnergetico(int n) {
		return 0;
    }
}

	public static void menu() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'menu'");
	}

	public static void decodificarCoordenadas() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'decodificarCoordenadas'");
	}

}