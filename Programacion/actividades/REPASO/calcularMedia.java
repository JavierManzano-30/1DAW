public class calcularMedia {
    public static void main(String[] args) {
        System.out.print("Dime el primer número: ");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Dime el segundo número: ");
        int b = Integer.parseInt(System.console().readLine());
        System.out.print("Dime el tercer número: ");
        int c = Integer.parseInt(System.console().readLine());
        System.out.print("Dime el primer número: ");
        int d = Integer.parseInt(System.console().readLine());
        System.out.print("Dime el primer número: ");
        int e = Integer.parseInt(System.console().readLine());
        System.out.print("Dime el primer número: ");
        int f = Integer.parseInt(System.console().readLine());
        System.out.print("Dime el primer número: ");
        int g = Integer.parseInt(System.console().readLine());

        int media = (a + b + c + d + e + f + g) / 7;
        System.out.println("La media es: " + media);
    }
}
