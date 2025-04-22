/*
 * Implemente una función que sirva para cifrar un texto con el conocido método de César.
 * El criptosistema consiste en el desplazamiento de 3 caracteres en la posición  del carácter 
 * a cifrar, es decir, la A se sustituye por la D, la B por la E, ..., la X por la A, la Y por la B,
 * y la Z por la C. Por simplicidad, supondremos que el texto a cifrar solo contiene caracteres alfabéticos.
 * Implementar la siguiente función:
 */

public class CifradoCesar {

    final static String diccionario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ_";

    public static void main(String[] args) {

        String cadenaACifrar = "HOLA_MUNDO";

        String cadenaCifrada = cifrar(cadenaACifrar);

        System.out.println(cadenaCifrada);

        String cadenaDescifrada = descifrar(cadenaCifrada);

        System.out.println(cadenaDescifrada);
    }

    public static String cifrar(String palabra) {

        String palabraCifrada = "";

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            int posicion = diccionario.indexOf(caracter);

            int nuevaPosicion = (posicion + 3) % diccionario.length();

            palabraCifrada += diccionario.charAt(nuevaPosicion);
        }
        return palabraCifrada;
    }

    public static String descifrar(String palabraCifrada) {

        String palabraDescifrada = "";

        for (int i = 0; i < palabraCifrada.length(); i++) {
            char caracter = palabraCifrada.charAt(i);

            int posicion = diccionario.indexOf(caracter);

            int nuevaPosicion = 0;

            if(posicion -3 < 0){
                nuevaPosicion = (posicion - 3 + diccionario.length()) % diccionario.length();
                palabraDescifrada += diccionario.charAt(nuevaPosicion);
            }
            else{
                nuevaPosicion = (posicion - 3) % diccionario.length();
                palabraDescifrada += diccionario.charAt(nuevaPosicion);
            }
        }

        return palabraDescifrada;
    }
}