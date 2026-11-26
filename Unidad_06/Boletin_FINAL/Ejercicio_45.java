import java.util.Random;
import java.util.Scanner;

public class Ejercicio_45 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            String[] palabras = { "MELOCOTON", "AUTOCARAVANA" };
            String palabra = palabras[rand.nextInt(palabras.length)];
            char[] letras = palabra.toCharArray();
            char aux;
            int pos;

            for (int i = 0; i < letras.length; i++) {
                pos = rand.nextInt(letras.length);
                aux = letras[i];
                letras[i] = letras[pos];
                letras[pos] = aux;
            }

            String respuesta = "";
            int intento = 0;

            System.out.println("Palabra desordenada: " + new String(letras));

            do {

                if (intento == 3) {
                    System.out.println("La primera letra es: " + palabra.charAt(0));
                }

                System.out.print("Intento " + (intento + 1) + ": ");
                respuesta = sc.nextLine().trim();

                intento++;
            } while (!respuesta.equalsIgnoreCase(palabra));

            if (respuesta.equalsIgnoreCase(palabra)) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("¡FIN DEL JUEGO!");
            }

        }
    }
}