
import java.util.Scanner;

public class Ejercicio_16 {
        public static void main(String[] args) {
                int array[] = new int[10];
                Scanner input = new Scanner(System.in);
                int numero = 0;
                boolean encontrado = false;

                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i + 1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());
                }

                System.out.print("Introduce el numero que quieres buscar: ");
                numero = Integer.parseInt(input.nextLine());

                for (int i = 0; i < array.length; i++) {
                        if (array[i] == numero) {
                                System.out.println("Numero encontrado! Su posicion es: " + i);
                                encontrado = true;
                                break;
                        }
                }

                if (!encontrado) {
                        System.out.println("Numero no encontrado!");
                }

                input.close();
        }
}



