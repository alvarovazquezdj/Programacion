
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                int array[] = new int[10];
                Scanner input = new Scanner(System.in);
                int numero;

                while (true) {
                        System.out.print("Introduce un numero entero positivo: ");
                        numero = Integer.parseInt(input.nextLine());
                        if (numero >= 0) {
                                for (int i = 0; i < array.length; i++) {
                                        array[i] = numero * (i + 1);
                                }
                                break;
                        }

                        System.out.println("El valor introducido no es correcto.");
                }

                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                }

                input.close();
        }
}



