import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in, "UTF-8")) {
            String[] palabras = { "Javalín, javalón", "javalén, len, len" };
            System.out.print("Introduce una frase: ");
            String frase = sc.nextLine();
            String resultado;

            if (frase.startsWith(palabras[0])) {
                System.out.println("La frase usa dialecto Javalandia");
                resultado = frase.substring(palabras[0].length(), frase.length()).trim();
                System.out.println("Mensaje sin muletillas: " + resultado);
            } else if (frase.endsWith(palabras[1])) {
                System.out.println("La frase usa dialecto Javalandia");
                resultado = frase.substring(0, frase.length() - palabras[1].length()).trim();
                System.out.println("Mensaje sin muletillas: " + resultado);
            } else {
                System.out.println("La frase no usa dialecto Javalandia");
            }
            
        }
    }
}