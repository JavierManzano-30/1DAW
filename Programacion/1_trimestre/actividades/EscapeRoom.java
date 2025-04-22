import java.util.*;

public class EscapeRoom{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido Escape Room ADA ITS.\nInserte su nombre: ");
        String nombreJugador = sc.nextLine();

        boolean sala1 = true;
        boolean sala2 = true;
        boolean jugarOtravez = true;

        
        while(sala1){
            System.out.println("**** Sala 1: Encuentro con Darth Vader ****");
            System.out.println();
            System.out.print("Introduzca una palabra: ");
            String palabra = sc.nextLine();
            String palabraCambiada = "";
            int indice = palabra.length() - 1;
            while(indice >= 0){
                palabraCambiada += palabra.charAt(indice);
                indice--;
            }
            System.out.println("La palabra conseguida es: " + palabraCambiada);
            System.out.println("Enhorabuena, has logrado pasar a la siguiente sala.");

            sala1 = false;
        }
        System.out.println();
        System.out.println("**** Sala 2: El Laberinto de los Colores ****");
        System.out.println();
        while(jugarOtravez){   
            while(sala2){
                final int rojo = 1;
                final int verde = 2;
                final int azul = 3; 
                int rondas = 1;
                int pasosJugador = 1;
                int intentosRestantes = 15;
                
                System.out.println("¡Bienvenido al laberinto de los colores!");
                System.out.println("Objetivo: Alcanzar exactamente 10 pasos antes de que se acaben los 15 intentos.");


                while(!(pasosJugador > 10 || intentosRestantes < 1)){
                        
                    System.out.println("*** Ronda " + rondas + " ***");
                    System.out.println("Intentos restantes: " + intentosRestantes);
                    System.out.println("Pasos actuales: " + pasosJugador);

                    System.out.println(" 1. Rojo\n 2. Verde\n 3. Azul");

                    System.out.println("Selecciona un color: ");
                    int movimientoJugador = sc.nextInt();

                    //switch (movimientoJugador){ //Como no se hacer el porcentaje, le doy opciones que son parecidos al porcentaje pedido
                    //    case rojo:
                    //        System.out.println("Selecciona un número: \n1.opcion1\n2.opcion2\n3.opcion3");
                    //        int opcion = sc.nextInt();                        
                    //        int opcion1 = pasosJugador + 0;
                    //        int opcion2 = pasosJugador - 1;
                    //        int opcion3 = pasosJugador - 1;
                    //        break;
                    //    
                    //    case verde:
                    //        System.out.println("Bébete una poción: \n1.pocion1\n2.pocion2");
                    //        int pocion = sc.nextInt(); 
                    //        int pocion1 = pasosJugador - 1;
                    //        int pocion2 = pasosJugador + 2;
                    //        break;
                    //
                    //    case azul:
                    //        System.out.println("Lanza un cuchillo: \n1.cuchillo1\n2.cuchillo2\n3.cuchillo3\n4.cuchillo4");
                    //        int cuchillo = sc.nextInt(); 
                    //        int cuchillo1 = pasosJugador + 3;
                    //        int cuchillo2 = pasosJugador + 3;
                    //        int cuchillo3 = pasosJugador + 3;
                    //        int cuchillo4 = pasosJugador - pasosJugador;
                    //
                    //        break;
                    //    default:
                    //        System.out.println("Movimiento no válido.");
                    //        break;
                    //}
                    switch (movimientoJugador){ //Como no se hacer el porcentaje, le doy opciones que son parecidos al porcentaje pedido
                        case rojo:
                            System.out.println("Selecciona un número: \n1.opcion1\n2.opcion2\n3.opcion3");
                            pasosJugador--;
                            break;
                        
                        case verde:
                            pasosJugador = pasosJugador + 2;
                            break;
                    
                        case azul:
                            pasosJugador = pasosJugador - pasosJugador;
                            break;
                        default:
                            System.out.println("Movimiento no válido.");
                            break;
                    }
                    intentosRestantes--;
                    rondas++;
                    
                    
                }
                
                
                if(pasosJugador < 1 || intentosRestantes > 15){
                    System.out.println("Has perdido.");
                }else{
                    System.out.println("Has ganado.");
                }
                System.out.println("¿Quieres jugar otra vez?: (Y/N)");
                String respuesta = sc.next();

                if(respuesta.toUpperCase().equals('N'))
                {
                    jugarOtravez = false;
                }
                rondas = 1;
                pasosJugador = 1;
                intentosRestantes = 15;
            }
        }
        sc.close();
        // el primer ejercicio cero y este pues lo visto, un abrazo
        // he dejado comentado una idea que tenia, pero por tiempo prefiero que al menos haga algo a que pete el sistema jaja :P
    }
}