import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_02 {

        static void ordenar(int[] numeros, boolean ascendente) {
                int aux = numeros[0];
                if (ascendente) {

                        for (int i = 0; i < numeros.length - 1; i++) {
                                for (int j = 0; j < numeros.length - i - 1; j++) {
                                        if (numeros[j + 1] < numeros[j]) {
                                                aux = numeros[j + 1];
                                                numeros[j + 1] = numeros[j];
                                                numeros[j] = aux;
                                        }
                                }
                        }
                        System.out.println("Array ordenado: " + Arrays.toString(numeros));
                } else {
                        for (int i = 0; i < numeros.length - 1; i++) {
                                for (int j = 0; j < numeros.length - i - 1; j++) {
                                        if (numeros[j + 1] > numeros[j]) {
                                                aux = numeros[j + 1];
                                                numeros[j + 1] = numeros[j];
                                                numeros[j] = aux;
                                        }
                                }
                        }
                        System.out.println("Array ordenado: " + Arrays.toString(numeros));
                }
        }

        public static void main(String[] args) {
                int numeros[] = new int[10];
                Scanner input = new Scanner(System.in);
                boolean ascendente = false;
                int orden = 0;

                for (int i = 0; i < numeros.length; i++) {
                        System.out.print("Introduce el valor " + (i + 1) + ": ");
                        numeros[i] = input.nextInt();
                }

                System.out.println("Array original: " + Arrays.toString(numeros));

                while (true) {
                        System.out.println("Tipo de ordenación:\r\n" + //
                                        "1. Ascendente\r\n" + //
                                        "2. Descendente");
                        orden = input.nextInt();

                        if (orden == 1) {
                                ascendente = true;
                                break;
                        } else if (orden == 2) {
                                break;
                        } else {
                                System.out.println("Debe de elegir entre 1 o 2.");
                        }
                }

                ordenar(numeros, ascendente);

                input.close();
        }
}
