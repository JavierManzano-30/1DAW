public class Factorial{
  public static void main(String[] args){
    int numero = Integer.parseInt(args[0]);
    int factorial = 1;
    for(int indice = 1; indice <= numero; indice++){
      factorial = factorial * indice;
      System.out.println("El resultado es: " + factorial + " cuando el numero es: " + indice);
    }
    System.out.println(factorial);
  }
}