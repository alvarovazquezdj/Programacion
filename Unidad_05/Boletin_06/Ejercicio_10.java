
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_10 {

    static void main(String[] args) {
        int[] numeros = new int[15];
        Arrays.fill(numeros, 5);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Introduce la posicion: ");
                int pos = input.nextInt();
                if (pos > 0 && pos <= numeros.length - 1) {
                    break;
                }

                
            }

            System.out.print("Introduce la posicion: ");
            int val = input.nextInt();

            numeros[pos] = val;
        }

    }
}
