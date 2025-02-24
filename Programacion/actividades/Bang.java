import java.util.*;
public class Bang{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de los vaqueros. Inserte su nombre: ");
        String nombreJugador = sc.nextLine();

        System.out.println("El juego está apunto de empezar, agarrense los machos.");

        boolean vidaJugador = true;
        boolean vidaMaquina = true;
        
        int balasJugador = 0;
        int balasMaquina = 0;
        int rondas = 1;

        final int recargar = 1;
        final int bloquear = 2;
        final int disparar = 3;

        boolean maquinaDisparaConBala = true;
        boolean jugadorDisparaConBala = true;

        boolean jugarOtravez = true;
        
        while(jugarOtravez){
            while(vidaJugador && vidaMaquina){
                System.out.println("*** Ronda " + rondas + " ***");
                
                System.out.println(" 1. Recargar\n 2. Bloquear\n 3. Disparar");

                System.out.println("Selecciona un movimiento: ");

                int movimientoJugador = sc.nextInt();
                int movimientoMaquina = (int)(Math.random() * 3 + 1);

                switch (movimientoJugador){
                    case recargar:
                        
                        balasJugador++;
                        System.out.println(nombreJugador + " ha recargado una bala.");
                        break;
                    
                    case bloquear:

                        System.out.println(nombreJugador + " ha bloqueado.");

                        break;
                        

                    case disparar:
                        
                        if(balasJugador > 0){

                            balasJugador--;
                            System.out.println(nombreJugador + " ha disparado.");
                        }
                        else{
                            jugadorDisparaConBala = false;
                            System.out.println(nombreJugador + " ha intentado disparar pero no tenía balas.");
                        }
                        break;

                    default:
                        System.out.println("Movimiento no válido.");
                        break;

                    
                }

                switch (movimientoMaquina){
                    case recargar:
                        
                        balasMaquina++;
                        System.out.println("La máquina ha recargado una bala.");
                        break;
                    
                    case bloquear:

                        System.out.println("La máquina ha bloqueado.");
                        break;

                    case disparar:
                        
                        if(balasMaquina > 0){

                            balasMaquina--;
                            System.out.println("La máquina ha disparado.");
                        }
                        else{
                            maquinaDisparaConBala = false;
                            System.out.println("La máquina ha intentado disparar pero no tenía balas.");
                        }
                        break;

                    default:
                        System.out.println("Movimiento no válido.");
                        break;   
                }

                // ¿QUÉ HA PASADO?
                if((jugadorDisparaConBala && movimientoJugador == disparar && movimientoMaquina == recargar) ||
                    (jugadorDisparaConBala && movimientoJugador == disparar && movimientoMaquina == disparar && !maquinaDisparaConBala)){
                    System.out.println("Has ganado a la máquina.");
                    vidaMaquina = false;
                }
                else if((maquinaDisparaConBala && movimientoMaquina == disparar && movimientoJugador == recargar) ||
                    (maquinaDisparaConBala && movimientoMaquina == disparar && movimientoJugador == disparar && !jugadorDisparaConBala)){
                    System.out.println("Ha ganado la máquina.");
                    vidaJugador = false;
                }
                else
                {
                    System.out.println("El juego continua...");
                }

                rondas++;
            }

            System.out.println("¿Quieres jugar otra vez?: (Y/N)");
            String respuesta = sc.next();

            if(respuesta.toUpperCase().equals("N"))
            {
                jugarOtravez = false;
            }

            vidaJugador = true;
            vidaMaquina = true;

            balasJugador = 0;
            balasMaquina = 0; 
            rondas = 1;          
        }    
        sc.close();
    }
}