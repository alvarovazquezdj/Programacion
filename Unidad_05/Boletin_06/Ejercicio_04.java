import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_04 {
    static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);


        System.out.print("Introduce un número entero: ");
        int numero = input.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numero * (i + 1);
        }

        System.out.println("Array: " + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + numeros[i]);
        }

        input.close();
    }
}
