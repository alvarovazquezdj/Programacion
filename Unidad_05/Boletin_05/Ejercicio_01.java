
import java.util.Scanner;

public class Ejercicio_01 {

        static int inscribir(int[] dorsales, int numCorredores, int dorsal) {

                if (dorsal <= 0) {
                        System.out.println("El dorsal " + dorsal + " no es válido: ");
                        return numCorredores;
                } else if (numCorredores >= dorsales.length) {
                        System.out.println("No hay plazas disponibles");
                        return numCorredores;
                } else {
                        for (int i = 0; i < numCorredores; i++) {
                                if (dorsales[i] == dorsal) {
                                        System.out.println("El dorsal " + dorsal + " ya está inscrito");
                                        return numCorredores;
                                }
                        }
                }

                dorsales[numCorredores] = dorsal;
                System.out.println("Corredor inscrito con dorsal: " + dorsal);
                return ++numCorredores;
        }

        static int eliminar(int[] dorsales, int numCorredores, int dorsal) {
                for (int i = 0; i < numCorredores; i++) {
                        if (dorsales[i] == dorsal) {
                                for (int j = i; j < numCorredores; j++) {
                                        dorsales[j] = dorsales[j + 1];
                                }
                                dorsales[numCorredores - 1] = 0;
                        }
                }
                System.out.println("Corredor dado de baja con dorsal: " + dorsal);
                return --numCorredores;
        }

        static void buscarDorsal(int[] dorsales, int numCorredores, int dorsal) {
                for (int i = 0; i < numCorredores; i++) {
                        if (dorsales[i] == dorsal) {
                                System.out.println("Corredor encontrado en la posicion: " + i);
                                return;
                        }
                }
                System.out.println(-1);
        }

        static void mostrar(int[] dorsales, int numCorredores) {
                System.out.print("Los corredores inscritos son:");
                for (int i = 0; i < numCorredores; i++) {
                        System.out.print(" " + dorsales[i]);
                }
        }

        public static void main(String[] args) {
                int dorsales[] = new int[20];
                int numCorredores = 0;
                int opcion = 0;
                Scanner input = new Scanner(System.in);
                int dorsal = 0;

                while (true) {
                        System.out.print("\n1. Inscribir corredor\r\n" + //
                                        "2. Dar de baja un corredor\r\n" + //
                                        "3. Buscar dorsal\r\n" + //
                                        "4. Mostrar corredores inscritos\r\n" + //
                                        "5. Consultar plazas disponibles\r\n" + //
                                        "6. Salir\n");

                        opcion = input.nextInt();

                        switch (opcion) {
                                case 1 -> {
                                        System.out.print("Introduce el dorsal del corredor a inscribir: ");
                                        dorsal = input.nextInt();
                                        numCorredores = inscribir(dorsales, numCorredores, dorsal);
                                }
                                case 2 -> {
                                        System.out.print("Introduce el dorsal del corredor a dar de baja: ");
                                        dorsal = input.nextInt();
                                        numCorredores = eliminar(dorsales, numCorredores, dorsal);
                                }
                                case 3 -> {
                                        System.out.print("Introduce el dorsal del corredor a buscar: ");
                                        dorsal = input.nextInt();
                                        buscarDorsal(dorsales, numCorredores, dorsal);
                                }
                                case 4 -> mostrar(dorsales, numCorredores);
                                case 5 -> {
                                        System.out.println("Número de corredores inscritos: " + numCorredores);
                                        System.out.println("Plazas disponibles: " + (dorsales.length - numCorredores));
                                }
                                case 6 -> {
                                        System.out.println("Saliendo del programa...");
                                        input.close();
                                        System.exit(0);
                                }
                                default -> System.out.println("Opción inválida. Inténtalo de nuevo.");

                        }
                }
        }
}
