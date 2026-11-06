

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_02 {

    static void sustituirNegativos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un número: ");
            array[i] = input.nextInt();
        }

        System.out.println("Original: " + Arrays.toString(array));

        sustituirNegativos(array);

        System.out.println("Modificado: " + Arrays.toString(array));

        input.close();

    }
}
