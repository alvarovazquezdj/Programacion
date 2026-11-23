import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce la primera frase: ");
            String primeraFrase = sc.nextLine();
            boolean iguales = true;
            System.out.print("Introduce la segunda frase: ");
            String segundaFrase = sc.nextLine();

            if (primeraFrase.length() == segundaFrase.length()) {
                for (int i = 0; i < primeraFrase.length(); i++) {
                    if (primeraFrase.charAt(i) != segundaFrase.charAt(i)) {
                        iguales = false;
                        break;
                    }
                }

                if (iguales) {
                    System.out.println("Las frases son exactamente iguales.");
                } else {
                    System.out.println("Las frases no son exactamente iguales.");
                }
            } else {
                System.out.println(primeraFrase.length() > segundaFrase.length() ? "La primera frase es mas larga." : "La segunda frase es mas larga.");
            }

        }
    }
}