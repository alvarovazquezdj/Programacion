import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce una contraseña: ");
            String contraseña = sc.nextLine();
            int letras = 0;
            int letrasMayusculas = 0;
            int letrasMinusculas = 0;
            int digitos = 0;
            int simbolos = 0;

            for (int i = 0; i < contraseña.length(); i++) {
                if (Character.isLetter(contraseña.charAt(i))) {
                    if (Character.isUpperCase(contraseña.charAt(i))) {
                        letras++;
                        letrasMayusculas++;
                    } else {
                        letras++;
                        letrasMinusculas++;
                    }
                } else if (Character.isDigit(contraseña.charAt(i))) {
                    digitos++;
                } else {
                    simbolos++;
                }
            }

            System.out.println("Letras: " + letras);
            System.out.println("Letras mayusculas: " + letrasMayusculas);
            System.out.println("Letras minusculas: " + letrasMinusculas);
            System.out.println("Digitos: " + digitos);
            System.out.println("Simbolos: " + simbolos);

        }
    }
}