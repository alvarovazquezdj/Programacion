import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
            String resultado = "";

            System.out.print("Introduce tu nombre completo: ");
            String nombre = sc.nextLine();

            for (int i = 0; i < nombre.length(); i++) {
                char letra = nombre.charAt(i);

                if (vocales.indexOf(letra) == -1) {
                    resultado += letra;
                }
            }

            System.out.println("Tu nombre completo sin vocales es: " + resultado);
        }
    }
}