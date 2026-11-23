import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Introduce una frase palindroma: ");
            String frase = sc.nextLine();
            frase = frase.replaceAll(" ", "").toLowerCase();
            int ultimaPosicion = frase.length() - 1;
            boolean palindroma = true;
            for (int i = 0; i < frase.length()/2; i++) {
                if (frase.charAt(i) != frase.charAt(ultimaPosicion)) {
                    System.out.println("La frase no es palindroma.");
                    palindroma = false;
                    break;
                }
                ultimaPosicion--;
            }

            if (palindroma) {
                System.out.println("La frase es palindroma.");
            }
        }
    }
}