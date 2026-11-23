import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String fraseAlternando = "";
            boolean mayusculas = true;
            System.out.print("Introduce una frase: ");
            String frase = sc.nextLine();

            for (int i = 0; i < frase.length(); i++) {
                if (Character.isWhitespace(frase.charAt(i))) {
                    fraseAlternando += frase.charAt(i);
                } else if (mayusculas) {
                    fraseAlternando += Character.toUpperCase(frase.charAt(i));
                    mayusculas = false;
                } else {
                    fraseAlternando += Character.toLowerCase(frase.charAt(i));
                    mayusculas = true;
                }

            }

            System.out.println("Frase original: " + frase);
            System.out.println("Frase en mayusculas: " + frase.toUpperCase());
            System.out.println("Frase en mayusculas: " + frase.toLowerCase());
            System.out.println("Frase alternando: " + fraseAlternando);
        }
    }
}