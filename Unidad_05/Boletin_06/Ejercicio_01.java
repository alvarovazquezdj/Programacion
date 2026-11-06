import java.util.Arrays;

public class Ejercicio_01 {
    static void main(String[] args) {
        int[] numeros = {12, 5, 8, 21, 3, 17, 9, 14};

        System.out.println("Número de elementos: " + numeros.length);
        System.out.println("Primer elemento: " + numeros[0]);
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);
        System.out.println("Array: " + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);            
        }
    }
}
