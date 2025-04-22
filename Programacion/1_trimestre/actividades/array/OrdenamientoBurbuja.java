package array;

public class OrdenamientoBurbuja 
{
    public static void main(String[] args) 
    {
        int[] numeros = { 5, 3, 8, 4, 2 };

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < numeros[i+1])
            {

            }
            if(numeros[i] > numeros[i+1])
            {
                numeros[i+1] = numeros[i];
            }

            System.out.print(numeros[i]);
        }
    }
}
