import java.util.Random;
import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String anagrama = "";
            Random aleatorio = new Random();
            int contador = 0;
            String respuesta;
            String palabra;
            int random;

            while (true) {
                System.out.print("Introduce una palabra: ");
                palabra = sc.nextLine().trim();

                if (palabra.length() == 0) {
                    System.err.println("No puedes introducir una cadena vacia.");
                    continue;
                }

                break;
            }

            int[] caracteres = new int[palabra.length()];

            while (contador < palabra.length()) {
                random = aleatorio.nextInt(palabra.length());
                boolean repetido = false;

                for (int i = 0; i < contador; i++) {
                    if (caracteres[i] == random) {
                        repetido = true;
                        break;
                    }
                }

                if (!repetido) {
                    anagrama += palabra.charAt(random);
                    caracteres[contador] = random;
                    contador++;
                }

            }

            do {
                System.out.println("El anagrama es: " + anagrama);
                System.out.print("Introduzca la palabra correcta: ");
                respuesta = sc.nextLine().trim();

                if (respuesta.length() == 0) {
                    System.out.println("La palabra no puede ser una cadena vacia.");
                } else if (palabra.equals(respuesta)) {
                    System.out.println("La palabra " + respuesta + " es correcta.");
                } else {
                    System.out.println("La palabra " + respuesta + " es incorrecta!");
                }

            } while (!respuesta.equals(palabra));
        }
    }
}