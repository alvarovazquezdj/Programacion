
import java.util.Scanner;

public class Ejercicio_07 {

    static void main(String[] args) {
        int[] numeros = {3, 8, 12, 5, 8, 21, 8, 14};
        Scanner input = new Scanner(System.in);
        int veces = 0;

        System.out.print("Ingresar número: ");
        int numero = input.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                veces++;

            }
        }

        if (veces > 0) {
            System.out.println("El número existe en el array");
            System.out.println("Aparece " + veces + " veces.");

        }

        System.out.print("Posiciones:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                System.out.print(" " + i);

            }
        }

    }
}
