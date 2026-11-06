
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_09 {

    static void main(String[] args) {
        Integer[] numeros = new Integer[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un numero: ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Array original: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
        System.out.println("El numero menor es " + numeros[0] + " y el mayor es " + numeros[numeros.length-1] + ".");
        Collections.reverse(Arrays.asList(numeros));
        System.out.println("Array orden inverso: " + Arrays.toString(numeros));
        
    }
}
