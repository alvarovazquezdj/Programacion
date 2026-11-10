import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_01 {

        static void buscar(int[] dorsales, int dorsal) {
                for (int i = 0; i < dorsales.length; i++) {
                        if (dorsales[i] == dorsal) {
                                System.out.println("Dorsal " + dorsal + " encontrado en la posicion " + i + ".");
                                return;
                        }
                }

                System.out.println("Dorsal " + dorsal + " no encontrado");
                return;
        }

        static int[] insertar(int[] dorsales, int dorsal) {

                for (int i : dorsales) {
                        if (i == dorsal) {
                                System.out.println("El dorsal " + dorsal + " ya esta registrado.");
                                return dorsales;
                        }
                }

                int[] dorsales2 = Arrays.copyOf(dorsales, dorsales.length + 1);
                dorsales2[dorsales.length] = dorsal;
                System.out.println("Dorsal registrado con exito.");
                return dorsales2;
        }

        static int[] eliminar(int[] dorsales, int dorsal) {
                for (int i = 0; i < dorsales.length; i++) {
                        if (dorsales[i] == dorsal) {
                                //aqui
                                int[] dorsales2 = Arrays.copyOfRange(dorsales);
                                dorsales2 = dorsales2;
                                System.out.println("Eliminado el dorsal " + dorsal + ".");
                                return dorsales2;
                        }
                }
                System.out.println("El dorsal " + dorsal + " no existe.");
                return dorsales;
        }
        public static void main(String[] args) {
                int[] dorsales = {105, 203, 118, 407, 312, 156, 290, 175};
                System.out.println(Arrays.toString(dorsales));
                Scanner input = new Scanner(System.in);
                boolean mostrarMenu = true;

                while (mostrarMenu) {
                        System.out.print("\n1. Mostrar dorsales\r\n" +
                                            "2. Buscar dorsal\r\n" +
                                            "3. Registrar dorsal\r\n" +
                                            "4. Mostrar corredores inscritos\r\n" +
                                            "5. Eliminar dorsal\r\n" +
                                            "6. Mostrar dorsales ordenados\r\n" +
                                            "7. Salir\nElige una opcion: ");
                        int opcion = input.nextInt();
                        switch (opcion) {
                                case 1 -> System.out.println(Arrays.toString(dorsales));
                                case 2 -> {
                                        System.out.print("Introduce el dorsal a buscar: ");
                                        buscar(dorsales, input.nextInt());
                                }
                                case 3 -> {
                                        System.out.print("Introduce el dorsal a insertar: ");
                                        int dorsal = input.nextInt();
                                        dorsales = insertar(dorsales, dorsal);
                                }

                                case 7 -> {
                                        mostrarMenu = false;
                                        System.out.println("Saliendo del programa...");
                                }
                                default -> System.out.println("La opcion " + opcion + " no es una opcion valida");
                        }
                        
                }
                input.close();
        }
}
