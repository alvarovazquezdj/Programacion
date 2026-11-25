import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static String simplificado(String[] nombres) {
        String[] nombreSep = new String[3];
        String nombreSimp = "";

        for (int i = 0; i < nombres.length; i++) {
            nombreSep = nombres[i].split(" ");
            for (int j = 0; j < nombreSep.length; j++) {
                nombreSimp += 
            }
            
        }
        return nombreSimp;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] nombres = new String[5];

            for (int i = 1; i < 6; i++) {
                System.out.print("Introduzca el nombre del empleado " + i + ": ");
                String nombre = sc.nextLine();

                nombres[i - 1] = nombre;
            }

            String[] nombresSimp = new String[5];

            for (int i = 0; i < nombresSimp.length; i++) {
                nombresSimp[i] = simplificado(nombres);
            }

            System.out.println(Arrays.toString(nombresSimp));
        }
    }
}