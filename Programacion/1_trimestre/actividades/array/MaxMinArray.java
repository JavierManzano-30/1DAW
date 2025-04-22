package array;

public class MaxMinArray 
{
    public static void main(String[] args) 
    {
        int[] numeros = { 3, 7, 2, 1, 6};

        int numMin = numeros[0];
        int numMax = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] > numMax)
            {
                numMax = numeros[i];
            }

            if(numeros[i] < numMin)
            {
                numMin = numeros[i];
            }
        }
        System.out.println("El minimo es el: " + numMin + " y el máximo es el: " + numMax);
    }
}
