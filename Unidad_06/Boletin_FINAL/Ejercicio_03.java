import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int espacios = 0;
            int letras = 0;
            int digitos = 0;
            double porcentaje = 0;
            System.out.print("Introduce una frase: ");
            String frase = sc.nextLine();

            for (int i = 0; i < frase.length(); i++) {
                if (Character.isLetter(frase.charAt(i))) {
                    letras++;
                } else if (Character.isDigit(frase.charAt(i))) {
                    digitos++;
                } else if (Character.isWhitespace(frase.charAt(i))) {
                    espacios++;
                }
            }

            System.out.println("Longitud total: " + frase.length());
            System.out.println("Espacios totales: " + espacios);
            System.out.println("Letras totales: " + letras);
            System.out.println("Digitos totales: " + digitos);
            
            if (frase.length() > 0) {
                porcentaje = (double) letras / frase.length() * 100;
            }

            System.out.println("Porcentaje letras: " + porcentaje + "%");

        }
    }
}