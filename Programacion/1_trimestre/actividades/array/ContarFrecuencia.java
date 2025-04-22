package array;

public class ContarFrecuencia 
{
    public static void main(String[] args) 
    {
        int[] numeros = { 1, 2, 3, 4, 1, 2, 1, 5};

        int numeroBuscar = 1;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == numeroBuscar)
            {
                contador++;
            }
        }

        System.out.println("El número " + numeroBuscar + " aparece " + contador + " veces.");
    }
}
