import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String palabra;
            String frase = "";
            do {
                System.out.print("Introduce una palabra para formar la frase: ");
                palabra = sc.nextLine();

                if (!palabra.equalsIgnoreCase("FIN")) {
                    frase += palabra + " ";
                }
            } while (!palabra.equalsIgnoreCase("FIN"));

            System.out.println(frase.trim());
        }
    }
}