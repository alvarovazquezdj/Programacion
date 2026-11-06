import java.util.Arrays;

public class Ejercicio_03 {
    static void main(String[] args) {
        int[] numeros = new int[20];
        int multiplos = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }


        System.out.println(Arrays.toString(numeros));

        System.out.print("Numeros pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(" " + numero);
            }
        }

        for (int numero : numeros) {
            if (numero % 3 == 0) {
                multiplos++;
            }
        }
        System.out.print("\nTotal numeros multiplos de 3: " + multiplos);
    }
}
