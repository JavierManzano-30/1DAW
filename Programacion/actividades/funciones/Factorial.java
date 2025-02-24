public class Factorial {

    public static int CalcularFactorial(int numero) {
        if (numero == 1) {

            return numero;
        }

        return numero * CalcularFactorial(numero - 1);
    }

    public static void main(String[] args) {
        System.out.println(CalcularFactorial(6));
    }
}
