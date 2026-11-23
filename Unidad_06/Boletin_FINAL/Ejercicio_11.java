import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int primera = -1;
            int ultima = -1;
            int total = 0;
            System.out.print("Introduce una frase: ");
            String frase = sc.nextLine();

            System.out.print("Introduce un caracter: ");
            char caracter = sc.nextLine().charAt(0);

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == caracter) {
                    if (primera == -1) {
                        primera = i;
                    }

                    ultima = i;
                    total++;
                }
            }

            if (total != 0) {
                System.out.println(
                        "La primera vez que aparece el caracter " + "'" + caracter + "'" + " es en la posicion "
                                + primera + ".");
                System.out
                        .println("La ultima vez que aparece el caracter " + "'" + caracter + "'" + " es en la posicion "
                                + ultima + ".");
                System.out.println("El caracter " + "'" + caracter + "'" + " aparece un total de " + total + " veces.");
            } else {
                System.out.println("El caracter " + "'" + caracter + "'" + " no existe en la frase.");
            }

        }
    }
}