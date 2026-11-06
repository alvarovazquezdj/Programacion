
import java.util.Arrays;

public class Ejercicio_09 {

    static void main(String[] args) {
        int[] numeros = {3, 8, 12, 5, 8, 21, 8, 14, 1, 3, 30, 27};
        int[] numerosImpares = new int[6];
        int[] numerosPares = new int[6];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numerosImpares[pares] = numeros[i];
                pares++;
            } else {
                numerosPares[impares] = numeros[i];
                impares++;
            }
        }

        System.out.println("El total de numeros pares es de " + pares + " y el total de numeros impares es de " + impares + ".");
        System.out.println("Array de números pares: " + Arrays.toString(numerosPares));
        System.out.println("Array de números impares: " + Arrays.toString(numerosImpares));

        Arrays.sort(numerosPares);
        Arrays.sort(numerosImpares);

        System.out.println("Array ordenado de números pares: " + Arrays.toString(numerosPares));
        System.out.println("Array ordenado de números impares: " + Arrays.toString(numerosImpares));

    }
}
