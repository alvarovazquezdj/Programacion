import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce tu nombre y apellidos: ");
            String nombreCompleto = sc.nextLine();
            String usuario = "";
            int caracteres = 4;

            for (int i = 0; i < 3 && i < nombreCompleto.length(); i++) {
                if (Character.isWhitespace(nombreCompleto.charAt(i))) {
                    break;
                }
                usuario += nombreCompleto.charAt(i);
            }

            for (int i = 0; i < nombreCompleto.length(); i++) {
                if (Character.isWhitespace(nombreCompleto.charAt(i))) {
                    for (int j = i + 1; j < i + caracteres && j < nombreCompleto.length(); j++) {
                        if (Character.isWhitespace(nombreCompleto.charAt(j))) {
                            break;
                        }

                        usuario += nombreCompleto.charAt(j);
                    }
                    caracteres--;
                }
            }

            System.out.println("Nombre de usuario: " + usuario.toLowerCase());
        }
    }
}