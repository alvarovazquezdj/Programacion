import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
//1.- Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales (mayúsculas, minúsculas y acentuadas). Por ejemplo, «Álvaro Pérez» se mostrará «lvr Prz».

        int pos = 0;
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
        String resultado = "";

        System.out.print("Introduce tu nombre completo: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);

            if (vocales.indexOf(letra) == -1) {
                resultado += letra;
            }
        }

        System.out.println("Tu nombre completo sin vocales es:" + resultado);

    }
}