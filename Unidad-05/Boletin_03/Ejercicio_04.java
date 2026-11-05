import java.util.Scanner;

public class Ejercicio_04 {

    static int eliminar(int[] numeros, int numElementos, int valor) {
        if (numElementos > 0) {
            for (int i = 0; i < numElementos; i++) {
                if (numeros[i] == valor) {
                    for (int j = i; j < numElementos - 1; j++) {
                        numeros[j] = numeros[j + 1];
                    }
                    numeros[numElementos - 1] = 0;
                    numElementos--;
                    break;
                }
            }

        } else {
            System.out.println("Valor no encontrado, el array está vacío.");
        }

        return numElementos;
    }

    public static void main(String[] args) {
        int[] numeros = { 2, 5, 8, 12, 16, 20, 25, 30, 0, 0, 0, 0 };
        int numElementos = 8;
        Scanner input = new Scanner(System.in);
        int valor = 0;

        System.out.print("Array original:");
        for (int i = 0; i < numElementos; i++) {
            System.out.print(" " + numeros[i]);
        }

        while (valor != -1) {

            System.out.print("\r\nNúmero a eliminar: ");
            valor = input.nextInt();
            input.nextLine();

            if (valor != -1) {
                numElementos = eliminar(numeros, numElementos, valor);
                System.out.print("Array resultante:");
                for (int i = 0; i < numElementos; i++) {
                    System.out.print(" " + numeros[i]);
                }
                System.out.println("\r\nElementos ocupados: " + numElementos);
            } else {
                System.out.println("Fin del programa.");
            }

        }

        input.close();
    }
}
