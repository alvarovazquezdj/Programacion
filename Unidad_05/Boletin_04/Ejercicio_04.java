
import java.util.Arrays;

public class Ejercicio_04 {

    static void ordenar(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] numeros = { 5, 2, 9, 1, 5, 6, 3, 4, 8, 7 };

        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        ordenar(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
    }
}
