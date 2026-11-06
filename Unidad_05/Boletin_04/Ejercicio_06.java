
import java.util.Scanner;

public class Ejercicio_06 {
    static int insertar(int[] numeros, int numElementos, int valor) {

        if (numElementos >= numeros.length) {
            System.out.println("No queda espacio disponible.");
            return numElementos;
        }

        numeros[numElementos] = valor;
        return ++numElementos;
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int numElementos = 0;
        int opcion = 0;
        boolean continuar = true;
        Scanner input = new Scanner(System.in);

        while (continuar) {
            System.out.print("1. Insertar número\r\n" + //
                    "2. Mostrar números almacenados\r\n" + //
                    "3. Consultar espacio disponible\r\n" + //
                    "4. Salir");

            opcion = input.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Numero a insertar: ");
                    int valor = input.nextInt();
                    numElementos = insertar(numeros, numElementos, valor);
                }

                case 2 -> {
                    System.out.print("Números almacenados: ");
                    for (int i = 0; i < numElementos; i++) {
                        System.out.print(" " + numeros[i]);
                    }
                }

                case 3 -> System.out.println("Espacio disponible: " + (numeros.length - numElementos));

                case 4 -> {
                    continuar = false;
                    System.out.println("Programa finalizado.");
                }

                default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
        input.close();
    }
}
