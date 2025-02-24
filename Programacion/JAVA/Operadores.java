public class Operadores {
  public static void main(String[] args){
    // Aritmeticos
    int suma = 3 + 4; // 7
    int resta = 3 - 4; // -1
    int multiplicacion = 3 * 4; // 12
    int division = 3 / 4; // 0
    int modulo = 3 % 4; // 3

    //Asignacion
    int directo = 123;
    int acumulador = 0;
    int cuenta = 15;
    acumulador = acumulador + 1; // 1
    acumulador++; // 2 Primero uso luego sumo
    ++acumulador; //3 Primero sumo luego uso
    acumulador += 2; // 5

    //Comparacion
    boolean iguales = 3 == 4; // eq equals
    boolean menor = 3 < 4; // lt === lower than
    boolean mayor = 3 > 3; // gt === greater than
    boolean menorOIgual = 4 <= 4; // lte
    boolean mayorOIgual = 4 >= 4; // gte
    boolean distinto = !(3 != 4);
    boolean falso = !true; // false

    //Logicos
    boolean negacion = !true; // false
    boolean and = true && true; // true
    boolean or = true || true; // true

    int numero = 0;
    boolean resultado = 1 != 1 && numero == 0;
    }
}