import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String entrada;
            char caracter;

            do {
                System.out.print("Introduce un caracter: ");
                entrada = sc.nextLine();

                if (entrada.length() != 1) {
                    System.out.println("No esta permitido introducir mas de 1 caracter.");

                }

                caracter = entrada.charAt(0);

            } while (entrada.length() != 1);

            if (Character.isLetter(caracter)) {
                if (Character.isUpperCase(caracter)) {
                    System.out.println("El caracter '" + caracter + "' introducido es una letra en mayusculas.");

                } else {
                    System.out.println("El caracter '" + caracter + "' introducido es una letra en minusculas.");

                }

                System.out.println("Caracter en mayusculas: " + Character.toUpperCase(caracter));
                System.out.println("Caracter en minusculas: " + Character.toLowerCase(caracter));

            } else if (Character.isDigit(caracter)) {
                System.out.println("El caracter '" + caracter + "' introducido es un digito.");

            } else {
                System.out.println("El caracter '" + caracter + "' introducido es un simbolo.");

            }

        }
    }
}