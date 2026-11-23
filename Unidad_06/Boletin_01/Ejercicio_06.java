import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        String conjunto = "eikmpqrstuv";
        String codificacion = "pviumterkqs";
        
        System.out.print("Introduce una palabrao o frase para codificar: ");
        String frase = sc.nextLine().toLowerCase();
        String fraseCodificada = "";
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            int pos = conjunto.indexOf(caracter);

            if (pos != -1) {
                fraseCodificada += codificacion.charAt(pos);
            } else {
                fraseCodificada += caracter;
            }
        }

        System.out.println(fraseCodificada);

        }
    }
}