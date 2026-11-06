
import java.util.Scanner;


public class Ejercicio_12 {
        public static void main(String[] args) {
                double array[] = new double[8];
                Scanner input = new Scanner(System.in);
                double suma = 0;

                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i+1) + ": ");
                        array[i] = Double.parseDouble(input.nextLine());
                        suma += array[i];
                }

                System.out.println("La suma total es: " + suma);
                System.out.println("La media aritmetica es: " + (suma / array.length));


                input.close();
        }
}



