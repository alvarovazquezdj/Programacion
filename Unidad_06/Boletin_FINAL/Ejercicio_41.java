import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_41 {

    static void palabra(char[] palabraSecreta) {
        System.out.print("Palabra:");
        for (int i = 0; i < palabraSecreta.length; i++) {
            System.out.print(" " + Character.toUpperCase(palabraSecreta[i]) + " ");
        }
    }

    static char introducirLetra(Scanner sc, char[] letrasUsadas, int contadorLetrasUsadas) {
        String letra = "";
        while (true) {
            boolean repetida = false;
            System.out.print("\nIntroduce una letra: ");
            letra = sc.nextLine().toLowerCase();

            if (letra.isEmpty()) {
                System.out.println("Debes introducir un caracter.");
            } else if (letra.length() > 1) {
                System.out.println("Solo se permite introducir un caracter.");
            } else if (!Character.isAlphabetic(letra.charAt(0))) {
                System.out.println("El caracter introducido no es una letra.");
            } else {
                for (int i = 0; i < contadorLetrasUsadas; i++) {
                    if (letrasUsadas[i] == letra.charAt(0)) {
                        repetida = true;
                    }
                }

                if (repetida == true) {
                    System.out.println("Esa letra ya fue usada.");
                } else {
                    break;
                }
            }
        }

        letrasUsadas[contadorLetrasUsadas] = letra.charAt(0);
        return letra.charAt(0);
    }

    static int resultado(String palabra, char[] palabraSecreta, char letra) {
        int aciertos = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra && palabraSecreta[i] == '_') {
                palabraSecreta[i] = letra;
                aciertos++;
            }
        }

        return aciertos;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] palabras = {
                    "ventana",
                    "caballo",
                    "planeta",
                    "cuchara",
                    "montaña",
                    "espejo",
                    "tomate",
                    "guitarra",
                    "zapato",
                    "nube"
            };

            Random ram = new Random();
            String palabra = palabras[ram.nextInt(palabras.length)];

            char[] palabraSecreta = new char[palabra.length()];
            Arrays.fill(palabraSecreta, '_');

            int intentos = 6;
            int aciertos = 0;

            char[] letrasUsadas = new char[27];
            Arrays.fill(letrasUsadas, ' ');

            int contadorLetrasUsadas = 0;

            do {
                palabra(palabraSecreta);

                System.out.println("\nIntentos restantes: " + intentos);

                System.out.print("Letras utilizadas: ");
                for (int i = 0; i < letrasUsadas.length; i++) {
                    if (letrasUsadas[i] != ' ') {
                        System.out.print(Character.toUpperCase(letrasUsadas[i]));
                    }
                }

                // Introducir letra
                char letra = introducirLetra(sc, letrasUsadas, contadorLetrasUsadas);
                contadorLetrasUsadas++;

                int contadorAciertos = resultado(palabra, palabraSecreta, letra);

                if (contadorAciertos != 0) {
                    aciertos += contadorAciertos;
                } else {
                    intentos--;
                }

            } while (intentos > 0 && aciertos < palabraSecreta.length);

            if (aciertos == palabraSecreta.length) {
                System.out.println("!GANASTE!");
                palabra(palabraSecreta);
            } else {
                System.out.println("!ELIMINADO!");
                System.out.println("La palabra secreta es: " + palabra);
            }

        }
    }
}