package array;
public class Sumar 
{
    public static void main(String[] args) 
    {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 40;
        numeros[3] = 60;
        numeros[4] = 100;

        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma es " + suma);
    }
}
