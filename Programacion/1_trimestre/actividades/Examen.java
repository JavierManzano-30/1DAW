import java.util.*;
public class Examen
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcionVolverAJugar = 2;
        do
        {
        System.out.println("Bienvenido maricon\nDame tu nombre: ");

        String nombreJugador = sc.nextLine();

        System.out.println("Dame la palabra: ");
        String palabra = sc.nextLine();
        String palabraResuelta = "";


        for(int indice = 0; indice < palabra.length(); indice += 2)
        {
            if(indice + 2 > palabra.length())
            {
                palabraResuelta += "";
                palabraResuelta += palabra.charAt(indice);
            }
            else
            {
                palabraResuelta += palabra.charAt(indice + 1);
                palabraResuelta += palabra.charAt(indice);
            }
            
        }

        System.out.println("La palabra es: " + palabraResuelta);
        if("NAKANI".equals(palabraResuelta))
        {
            // Sala 2
            int numeroIntentos = 15;
            final int pasosMeta = 10;
            int pasos = 0;
            final int rojo = 1;
            final int verde = 2;
            final int azul = 3;
            int rondas = 1;
            Random random = new Random();
            
            while(numeroIntentos > 0 && pasos < pasosMeta)
            {
                System.out.println("Intentos restantes :" + numeroIntentos);
                System.out.println("Ronda numero: " + rondas);
                System.out.println("Pasos actuales: " + pasos);
                System.out.println("Elige un color (1.Rojo, 2.Verde, 3.Azul): ");

                int opcionColor = sc.nextInt();
                
                int probabilidad = random.nextInt(100) + 1;

                switch (opcionColor)
                {
                    case rojo:
                        if(probabilidad < 30)
                        {
                            System.out.println("Escudo mágico activado.");
                        }
                        else
                        {
                            pasos--;
                            System.out.println("Has perdido un paso.");
                        }
                        break;

                    case verde:
                        if(probabilidad < 50)
                        {
                            pasos--;
                            System.out.println("Has caido en la trampa, retrocedes un paso.");
                        }
                        else
                        {
                            pasos += 2;
                            System.out.println("Avanzas dos pasitos.");
                        }
                        break;

                    case azul:
                        if(probabilidad < 80)
                        {
                            pasos += 3;
                            System.out.println("Hechizo activado, avanzas 3 pasos.");
                        }
                        else
                        {
                            pasos = 0;
                            System.out.println("Regresas al inicio.");
                        }
                        break;

                    default:
                        System.out.println("Color no valido. Pierdes un intento imbecil.");
                        numeroIntentos--;
                        break;
                }
                numeroIntentos--;
                rondas++;

                if(pasos == pasosMeta)
                {
                    System.out.println("Felicidades." + nombreJugador + " has ganado melón.");
                }
                else if(pasos < 0)
                {
                    pasos = 0;
                }
                else if(pasos > pasosMeta)
                {
                    pasos -= (pasos - pasosMeta);
                    System.out.println("Has superado los pasos y te devuelvo a la posicion" + pasos);
                }
                else if(numeroIntentos <= 0)
                {
                    System.out.println("Has perdido.");
                }
            }

            System.out.println("¿Quieres volver a jugar?\n1.Volver a jugar\n2.Salir");
            opcionVolverAJugar = sc.nextInt();
            
        }

        }
        while(opcionVolverAJugar == 1);
        sc.close();   
    }
}