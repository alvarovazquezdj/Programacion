import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Introduce tu nombre y apellidos: ");
            String nombreCompleto = sc.nextLine().toUpperCase();
            String iniciales = "";

            for (int i = 0; i < nombreCompleto.length(); i++) {
                if (iniciales.length() == 0 || nombreCompleto.charAt(i) == ' ') {
                    if (nombreCompleto.charAt(i) == ' ') {
                        i++;
                    }
                    
                    iniciales += nombreCompleto.charAt(i) + ".";
                }
            }

            System.out.println(iniciales);
        }
    }
}