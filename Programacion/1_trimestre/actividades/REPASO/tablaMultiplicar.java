public class tablaMultiplicar {
    public static void main(String[] args) {
        System.out.print("Dime que número quieres multiplicar: ");
        int numero = Integer.parseInt(System.console().readLine());
        
    }

    public static void imprimirTalba(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }
    }
}
