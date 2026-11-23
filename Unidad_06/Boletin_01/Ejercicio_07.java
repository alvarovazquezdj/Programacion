import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String abecedario = "abcdefghijklmnñopqrstuvwxyz";
            System.out.print("Introduce una frase para contar sus letas: ");
            String frase = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

            System.out.println(frase);
            for (int i = 0; i < abecedario.length(); i++) {
                char caracter = abecedario.charAt(i);
                int contador = 0;

                for (int j = 0; j < frase.length(); j++) {
                    if (caracter == frase.charAt(j)) {
                        contador++;
                    }
                }

                if (contador > 0) {
                    System.out.println(caracter + ": " + contador + " veces");
                }
            }
        }
    }
}