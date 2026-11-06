import java.util.Scanner;

public class Ejercicio_05 {

    static int insertarOrdenado(int[] numeros, int numElementos, int valor) {
        if (numElementos < numeros.length) {
            if (numElementos > 0) {
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
            } else {
                numeros[0] = valor;

            }
            numElementos++;
            System.out.print("Lista:");
            for (int i = 0; i < numElementos; i++) {
                System.out.print(" " + numeros[i]);
            }

        } else {
            System.out.println("No se puede insertar el valor, el array está lleno.");
        }

        return numElementos;
    }

    static int eliminar(int[] numeros, int numElementos, int valor) {
        if (numElementos > 0) {
            for (int i = 0; i < numElementos; i++) {
                if (numeros[i] == valor) {

                    for (int j = i; j < numElementos - 1; j++) {
                        numeros[j] = numeros[j + 1];
                    }

                    numeros[numElementos - 1] = 0;
                    numElementos--;

                    System.out.print("Lista:");
                    for (int j = 0; j < numElementos; j++) {
                        System.out.print(" " + numeros[j]);
                    }
                    break;
                } else if (i == numElementos - 1) {
                    System.out.println("Valor no encontrado.");

                }
            }
        } else {
            System.out.println("Valor no eliminado, el array está vacío.");
        }

        return numElementos;
    }

    static int buscar(int[] numeros, int numElementos, int valor) {

        if (numElementos <= 0) {
            return -1;
        }

        for (int i = 0; i < numElementos; i++) {
            if (numeros[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    static void mostrar(int[] numeros, int numElementos) {
        if (numElementos <= 0) {
            System.out.println("El array está vacío.");
            return;
        }

        System.out.print("Array actual:");
        for (int i = 0; i < numElementos; i++) {
            System.out.print(" " + numeros[i]);
        }
    }

    static double calcularMedia(int[] numeros, int numElementos) {
        double suma = 0.0;

        if (numElementos <= 0) {
            return suma;
        }
        for (int i = 0; i < numElementos; i++) {
            suma += numeros[i];
        }

        return suma / numElementos;
    }

    public static void main(String[] args) {
        int[] numeros = new int[15];
        int numElementos = 0;
        Scanner input = new Scanner(System.in);
        int valor = 0;
        boolean salir = true;
        int opcion = 0;

        while (salir) {
            System.out.print("\r\n1. Insertar número\r\n" + //
                    "2. Eliminar número\r\n" + //
                    "3. Buscar número\r\n" + //
                    "4. Mostrar lista ordenada\r\n" + //
                    "5. Consultar estadísticas\r\n" + //
                    "6. Salir" + //
                    "\r\nIntroducir comando: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("\r\nNúmero a insertar: ");
                    valor = input.nextInt();
                    input.nextLine();
                    numElementos = insertarOrdenado(numeros, numElementos, valor);
                }
                case 2 -> {
                    System.out.print("\r\nNúmero a eliminar: ");
                    valor = input.nextInt();
                    input.nextLine();
                    numElementos = eliminar(numeros, numElementos, valor);
                }
                case 3 -> {
                    System.out.print("\r\nNúmero a buscar: ");
                    valor = input.nextInt();
                    input.nextLine();
                    System.out.println(buscar(numeros, numElementos, valor));
                }
                case 4 -> mostrar(numeros, numElementos);
                case 5 -> {
                    System.out.println("Elementos: " + numElementos);
                    System.out.println(numElementos > 0 ? "Menor: " + numeros[0] : "Menor: N/A");
                    System.out.println(numElementos > 0 ? "Mayor: " + numeros[numElementos - 1] : "Mayor: N/A");
                    System.out.println(
                            numElementos > 0 ? "Media: " + calcularMedia(numeros, numElementos) : "Media: N/A");
                }
                case 6 -> {
                    salir = false;
                    System.out.println("Programa finalizado.");
                }
                default -> System.out.println(opcion + " no es un comando válido.");
            }
        }

        input.close();
    }
}
