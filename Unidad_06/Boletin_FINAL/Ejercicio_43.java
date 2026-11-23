import java.util.Random;
import java.util.Scanner;

public class Ejercicio_43 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random aleatorio = new Random();
            boolean turno = aleatorio.nextBoolean();
            int jugadas = 0;
            char caracter = ' ';
            String palabra;
            String palabras = "";
            String[] palabrasUsadas;

            System.out.println("COMIENZO DE PARTIDA");

            do {
                System.out.print("Jugador " + (turno ? 1 : 2) + ": ");
                palabra = sc.nextLine().toLowerCase();

                if (palabra.isEmpty()) {
                    System.out.println("Debes introducir una palabra.");
                    continue;
                } else if (palabra.length() <= 2) {
                    System.out.println("Debes introducir mas de 2 caracteres.");
                    continue;
                }

                boolean contieneNumeros = false;
                for (int i = 0; i < palabra.length(); i++) {
                    if (!Character.isAlphabetic(palabra.charAt(i))) {
                        contieneNumeros = true;
                        break;
                    }
                }

                if (contieneNumeros) {
                    System.out.println("No esta permitido introducir numeros.");
                    continue;
                }

                boolean palabraRepetida = false;
                palabrasUsadas = palabras.split(",");
                for (String palabraUsada : palabrasUsadas) {
                    if (palabraUsada.equalsIgnoreCase(palabra)) {
                        palabraRepetida = true;
                        break;
                    }
                }

                if (palabraRepetida) {
                    System.out.println("Esa palabra ya fue introducida.");
                    continue;
                }

                if (palabra.charAt(0) != caracter && (jugadas) > 1) {
                    System.out.println("FIN DEL JUEGO! EL JUGADOR " + (!turno ? 1 : 2) + " ES EL GANADOR!");
                    jugadas++;
                    break;
                } else {
                    turno = !turno;
                    palabras += palabras.isEmpty() ? palabra.toUpperCase() : "," + palabra.toUpperCase();
                    jugadas++;
                }

                caracter = palabra.charAt(palabra.length() - 1);

            } while (true);

            palabrasUsadas = palabras.split(",");
            palabras = "";
            for (String palabraUsada : palabrasUsadas) {
                if (palabras.isEmpty()) {
                    palabras += palabraUsada;
                } else {
                    palabras += ", " + palabraUsada;
                }
            }

            System.out.print("Palabras usadas: " + palabras);

            System.out.println("\nNumero de turnos jugados: " + jugadas);

        }
    }
}