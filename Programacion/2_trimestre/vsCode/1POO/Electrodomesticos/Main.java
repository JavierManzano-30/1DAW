public class Main {

    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora("Balay", 300, 1000, true);
        Lavadora lavadora2 = new Lavadora("Bosch", 200, 800, false);
        Lavadora lavadora3 = new Lavadora("Siemens", 400, 1200, true);

        System.out.println(lavadora1);
        System.out.println(lavadora2);
        System.out.println(lavadora3);

        System.out.println("Coste de consumo de lavadora1: " + lavadora1.getCosteConsumo(2, 0.15));
        System.out.println("Coste de consumo de lavadora2: " + lavadora2.getCosteConsumo(2, 0.15));
        System.out.println("Coste de consumo de lavadora3: " + lavadora3.getCosteConsumo(2, 0.15));
    }
}