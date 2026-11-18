import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // 2.- Diseñar un programa que solicite al usuario una frase y una palabra. A continuación buscará cuántas veces aparece la palabra en la frase.
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int contador = 0;
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.print("Introduce la palabra que desea buscar: ");
        String palabra = sc.nextLine();

        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();

        while (pos >= 0) {
            pos = frase.indexOf(palabra, pos);

            if (pos >= 0){
                contador++;
                pos = pos + palabra.length();
            }
        }

        System.out.println("La palabra " + palabra + " aparece un total de " + contador + " veces.");
    }
}