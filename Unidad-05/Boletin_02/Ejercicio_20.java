
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_20 {
        public static void main(String[] args) {
                int array[] = new int[10];
                Scanner input = new Scanner(System.in);
                int x = array.length - 1;
                int valor = 0;


                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i + 1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());
                }

                System.out.println("Original: " + Arrays.toString(array));

                for (int i = 0; i < array.length; i++) {
                        if (i < x) {
                                valor = array[i];
                                array[i] = array[x];
                                array[x] = valor;
                                x--;
                        }
                }

                System.out.println("Invertido: " + Arrays.toString(array));




                input.close();
        }
}



