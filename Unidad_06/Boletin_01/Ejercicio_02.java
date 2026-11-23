import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int pos = 0;
            int contador = 0;
            System.out.print("Introduce una frase: ");
            String frase = sc.nextLine();
            System.out.print("Introduce la palabra que desea buscar: ");
            String palabra = sc.nextLine();

            frase = frase.toLowerCase();
            palabra = palabra.toLowerCase();

            while (pos >= 0) {
                pos = frase.indexOf(palabra, pos);

                if (pos >= 0) {
                    contador++;
                    pos = pos + palabra.length();
                }
            }

            System.out.println("La palabra " + palabra + " aparece un total de " + contador + " veces.");
        }
    }
}