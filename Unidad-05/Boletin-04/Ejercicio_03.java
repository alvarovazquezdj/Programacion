
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_03 {

    static void intercambiar(int[] numeros, int posicion1, int posicion2) {
        int temp = numeros[posicion1];
        numeros[posicion1] = numeros[posicion2];
        numeros[posicion2] = temp;
    }

    public static void main(String[] args) {
        int array[] = {4, -3, 1, -3, 0, 4, 0, 8};
        Scanner input = new Scanner(System.in);
        boolean posicionesValidas = true;

        System.out.println("Original: " + Arrays.toString(array));

        while (posicionesValidas) {
            System.out.print("Introduce la primera posición: ");
            int pos1 = input.nextInt();

            if (pos1 < 0 || pos1 >= array.length) {
                System.out.println("Posición inválida. Inténtalo de nuevo.");
                continue;
            }

            System.out.print("Introduce la segunda posición: ");
            int pos2 = input.nextInt();

            if (pos2 < 0 || pos2 >= array.length) {
                System.out.println("Posición inválida. Inténtalo de nuevo.");
                continue;
            }

            intercambiar(array, pos1, pos2);
            posicionesValidas = false;
        }

        System.out.println("Modificado: " + Arrays.toString(array));

        input.close();

    }
}
