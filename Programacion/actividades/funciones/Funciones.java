public class Funciones {

    public static void print(String texto) {
        System.out.println(texto);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        print("Inicio");
        int suma = sumar(3, 4);
        print("La suma es: " + suma);
        print("Fin");

        print("Inicio");
        int division = dividir(4, 2);
        print("La división es: " + division);
        print("Fin");

        print("Inicio");
        int multiplicacion = multiplicar(2, 2);
        print("La multiplicación es: " + multiplicacion);
        print("Fin");

        print("Inicio");
        int resta = restar(5, 3);
        print("La resta es: " + resta);
        print("Fin");
    }
}