
import java.util.Scanner;

public class Ejercicio_04 {
        public static void main(String[] args) {
                int array[] = new int[5];

                Scanner input = new Scanner(System.in);

                System.out.print("Introduce el valor 1: ");
                array[0] = Integer.parseInt(input.nextLine());
                System.out.print("Introduce el valor 2: ");
                array[1] = Integer.parseInt(input.nextLine());
                System.out.print("Introduce el valor 3: ");
                array[2] = Integer.parseInt(input.nextLine());
                System.out.print("Introduce el valor 4: ");
                array[3] = Integer.parseInt(input.nextLine());
                System.out.print("Introduce el valor 5: ");
                array[4] = Integer.parseInt(input.nextLine());

                System.out.println("El elemento 1 es: " + array[0]);
                System.out.println("El elemento 2 es: " + array[1]);
                System.out.println("El elemento 3 es: " + array[2]);
                System.out.println("El elemento 4 es: " + array[3]);
                System.out.println("El elemento 5 es: " + array[4]);

                input.close();
        }
}



