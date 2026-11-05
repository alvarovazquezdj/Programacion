import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        boolean x = true;
        Integer valor = null;
        int numElementos = 0;

        while (x) {
            System.out.print("¿Cuántos números deseas introducir? ");
            valor = input.nextInt();
            if (valor > 0 && valor <= 10) {
                x = false;
            } else {
                System.out.println("Número inválido. Introduce un número entre 1 y 10.");
            }
        }

        for (int i = 0; i < valor; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
            numElementos++;
        }

        System.out.print("\nElementos almacenados: ");
        for (int i = 0; i < numElementos; i++) {
            System.out.print(" " + numeros[i]);
        }

        System.out.print("\nPosiciones ocupadas: " + numElementos);

        System.out.println("\nPosiciones libres: " + (numeros.length - numElementos));
    }
}
