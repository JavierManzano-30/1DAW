import java.util.*;

public class CajaCambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el importe a pagar: ");
        double importeAPagar = 0.0; 
        
            importeAPagar = sc.nextDouble();
        while(importeAPagar < 0){
            System.out.println("Tonto, pon un número positivo.");
            importeAPagar = sc.nextDouble();
        }
        
        System.out.println("Introduce el importe pagado: ");
        double importePagado = sc.nextDouble();
        while(importePagado < 0){
            System.out.println("Tonto, pon un número positivo.");
            importePagado = sc.nextDouble();
        }
        // Cantidad a devolver
        if (importePagado >= importeAPagar) {
            double cantidadADevolver = importePagado - importeAPagar;

            System.out.printf("Cantidad a devolver: %.2f\n", cantidadADevolver);

            // Separar la parte entera y decimal
            int parteEntera = (int) cantidadADevolver;
            int parteDecimal = (int) Math.round((cantidadADevolver - parteEntera) * 100);

            // Desglosar
            System.out.println("parteEntera a devolver: ");

            // parteEntera 500
            if (parteEntera >= 500) 
            {
                int parteEntera500 = parteEntera / 500;
                parteEntera %= 500;

                System.out.printf(parteEntera500 + " billete%s de 500 euros\n", parteEntera500 > 1?"s":"");
            }

            // parteEntera 200
            if (parteEntera >= 200) 
            {
                int parteEntera200 = parteEntera / 200;
                parteEntera %= 200;

                System.out.printf(parteEntera200 + " billete%s de 200 euros\n", parteEntera200 > 1?"s":"");
            }

            // parteEntera 100
            if (parteEntera >= 100) 
            {
                int parteEntera100 = parteEntera / 100;
                parteEntera %= 100;

                System.out.printf(parteEntera100 + " billete%s de 100 euros\n", parteEntera100 > 1?"s":"");
            }

            // parteEntera 50
            if (parteEntera >= 50) 
            {
                int parteEntera50 = parteEntera / 50;
                parteEntera %= 50;

                System.out.printf(parteEntera50 + " billete%s de 50 euros\n", parteEntera50 > 1?"s":"");
            }

            // parteEntera 20
            if (parteEntera >= 20) 
            {
                int parteEntera20 = parteEntera / 20;
                parteEntera %= 20;

                System.out.printf(parteEntera20 + " billete%s de 20 euros\n", parteEntera20 > 1?"s":"");
            }

            // parteEntera 10
            if (parteEntera >= 10) 
            {
                int parteEntera10 = parteEntera / 10;
                parteEntera %= 10;

                System.out.printf(parteEntera10 + " billete%s de 10 euros\n", parteEntera10 > 1?"s":"");
            }

            // parteEntera 5
            if (parteEntera >= 5) 
            {
                int parteEntera5 = parteEntera / 5;
                parteEntera %= 5;

                System.out.printf(parteEntera5 + " billete%s de 5 euros\n", parteEntera5 > 1?"s":"");
            }


            if (parteEntera >= 2) 
            {
                int moneda2 = parteEntera / 2;
                parteEntera %= 2;

                System.out.printf(moneda2 + " moneda%s de 2 euros\n", moneda2 > 1?"s":"");
            }

            if (parteEntera >= 1) 
            {
                int moneda1 = parteEntera / 1;
                parteEntera %= 1;

                System.out.printf(moneda1 + " moneda%s de 1 euro\n", moneda1 > 1?"s":"");
            }
            System.out.println("parteDecimal a devolver: ");

            if (parteDecimal >= 50) 
            {
                int moneda50 = parteDecimal / 50;
                parteDecimal %= 50;

                System.out.printf(moneda50 + " moneda%s de 50 céntimos\n", moneda50 > 1?"s":"");
            }

            if (parteDecimal >= 20) 
            {
                int moneda20 = parteDecimal / 20;
                parteDecimal %= 20;

                System.out.printf(moneda20 + " moneda%s de 20 céntimos\n", moneda20 > 1?"s":"");
            }

            if (parteDecimal >= 10) 
            {
                int moneda10 = parteDecimal / 10;
                parteDecimal %= 10;

                System.out.printf(moneda10 + " moneda%s de 10 céntimos\n", moneda10 > 1?"s":"");
            }

            if (parteDecimal >= 5) 
            {
                int moneda5 = parteDecimal / 5;
                parteDecimal %= 5;

                System.out.printf(moneda5 + " moneda%s de 5 céntimos\n", moneda5 > 1?"s":"");
            }

            if (parteDecimal >= 2) 
            {
                int moneda2 = parteDecimal / 2;
                parteDecimal %= 2;

                System.out.printf(moneda2 + " moneda%s de 2 céntimos\n", moneda2 > 1?"s":"");
            }

            if (parteDecimal >= 1) 
            {
                System.out.printf("1 moneda de 1 céntimo");
            }
        } else 
        {
            System.out.println("HOY NO SE FIA, MAÑANA");
        }

        sc.close();
    }
}