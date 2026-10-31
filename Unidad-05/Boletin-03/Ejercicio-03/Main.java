import java.util.Arrays;
import java.util.Scanner;

public class Main {

        static int insertarOrdenado(int[] numeros, int numElementos, int valor) {
                int aux = 0;
                for (int i = 0; i < numeros.length; i++) {
                        if (valor < numeros[i]) {
                                aux = numeros[i];
                                numeros[i] = valor;
                                valor = aux;
                        } else {
                                numeros[numElementos] = valor;
                        }

                }
                System.out.println(Arrays.toString(numeros));
                return 0;
        }

        public static void main(String[] args) {
                int[] numeros = { 3, 7, 12, 18, 25, 0, 0, 0, 0, 0 };
                int numElementos = 5;
                Scanner input = new Scanner(System.in);
                int valor = 0;

                System.out.print("Array original:");
                for (int i = 0; i < numElementos; i++) {
                        System.out.print(" " + numeros[i]);
                }

                System.out.print("\r\nIntroduce un número: ");
                valor = input.nextInt();
                insertarOrdenado(numeros, numElementos, valor);
                numElementos++;

                input.close();
        }
}
