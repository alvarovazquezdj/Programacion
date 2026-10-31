import java.util.Arrays;
import java.util.Scanner;

public class Main {

        static int insertarOrdenado(int[] numeros, int numElementos, int valor) {
                if (numElementos < numeros.length) {
                        for (int i = numElementos - 1; i >= 0; i--) {
                                if (valor < numeros[i]) {
                                        numeros[i + 1] = numeros[i];
                                } else {
                                        numeros[i + 1] = valor;
                                        break;
                                }

                                if (i == 0) {
                                        numeros[i] = valor;
                                        break;
                                }

                        }
                        numElementos++;
                        System.out.println("Valor insertado correctamente.");
                        System.out.println("Array resultante: " + Arrays.toString(numeros));

                } else {
                        System.out.println("No se puede insertar el valor, el array está lleno.");
                }

                return numElementos;
        }

        public static void main(String[] args) {
                int[] numeros = { 3, 7, 12, 18, 25, 0, 0, 0, 0, 0 };
                int numElementos = 5;
                Scanner input = new Scanner(System.in);
                int valor = 0;
                boolean x = true;

                System.out.print("Array original:");
                for (int i = 0; i < numElementos; i++) {
                        System.out.print(" " + numeros[i]);
                }

                while (x) {
                        System.out.print("\r\n¿Desea insertar un valor? (s/n): ");
                        String respuesta = input.nextLine();

                        if (respuesta.equals("s")) {
                                System.out.print("\r\nIntroduce un número: ");
                                valor = input.nextInt();
                                input.nextLine();
                                numElementos = insertarOrdenado(numeros, numElementos, valor);
                        } else {
                                x = false;
                        }
                }

                System.out.println("Array resultante: " + Arrays.toString(numeros));
                System.out.println("Elementos ocupados: " + numElementos);

                input.close();
        }
}
