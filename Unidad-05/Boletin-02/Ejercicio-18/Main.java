
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                int array[] = new int[10];
                Scanner input = new Scanner(System.in);
                int numeroSustituir = 0;
                int numeroReemplazar = 0;
                int sustituciones = 0;


                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i + 1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());
                }

                System.out.print("Introduce el numero que quieres sustituir: ");
                numeroSustituir = Integer.parseInt(input.nextLine());

                System.out.print("Introduce el numero que lo reemplazarÃ¡: ");
                numeroReemplazar = Integer.parseInt(input.nextLine());

                for (int i = 0; i < array.length; i++) {
                        if (array[i] == numeroSustituir) {
                            array[i] = numeroReemplazar;
                            sustituciones++;
                        }
                }

                System.out.println(Arrays.toString(array));
                System.err.println("Se realizo " + sustituciones + " sustitucion/es.");



                input.close();
        }
}



