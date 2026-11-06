import java.util.Scanner;


public class Ejercicio_11 {
        public static void main(String[] args) {
                int array[] = new int[10];
                Scanner input = new Scanner(System.in);
                int suma = 0;

                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i+1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());
                        suma += array[i];
                }

                System.out.println("La suma total es: " + suma);

                input.close();
        }
}



