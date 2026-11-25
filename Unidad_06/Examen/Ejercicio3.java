import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void mostrarParticipantes(String[] participantes) {
        for (int i = 0; i < participantes.length; i++) {
            System.out.println("Participante " + (i + 1) + ": " + participantes[i]);
        }
    }

    public static int buscar(String[] participantes, String nombre) {
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }

        return -1;
    }

    public static String[] añadir(String[] participantes, String nombre) {

        if (nombre.isEmpty()) {
            return participantes;
        }

        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i].equalsIgnoreCase(nombre)) {
                return participantes;
            }
        }

        String[] participantes2 = new String[participantes.length + 1];
        for (int i = 0; i < participantes.length; i++) {
            participantes2[i] = participantes[i];
        }

        participantes2[participantes2.length - 1] = nombre;

        return participantes2;
    }

    public static String[] eliminar(String[] participantes, String nombre) {
        boolean existe = false;
        int j = 0;
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i].equalsIgnoreCase(nombre)) {
                existe = true;
            }
        }

        if (!existe) {
            return participantes;
        }

        String[] participantes2 = new String[participantes.length - 1];
        for (int i = 0; i < participantes.length - 1; i++) {
            if (participantes[i] != nombre) {
                participantes2[j] = participantes[i];
                j++;
            }

        }

        return participantes2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] participantes = { "Ana", "Carlos", "Lucia", "Pedro", "Marta" };
            String nombre = "";
            int opcion;

            do {
                System.out.println("===== GESTION DE INSCRIPCIONES =====");
                System.out.println("1. Mostrar participantes");
                System.out.println("2. Buscar participante");
                System.out.println("3. Añadir participante");
                System.out.println("4. Eliminar participante");
                System.out.println("5. Mostrar participantes ordenados");
                System.out.println("6. Salir");
                System.out.print("Elige una opcion: ");
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                    case 1 -> mostrarParticipantes(participantes);
                    case 2 -> {
                        System.out.print("Introduzca el nombre del participante que desea buscar: ");
                        nombre = sc.nextLine().trim();
                        System.out.println(buscar(participantes, nombre));
                    }
                    case 3 -> {
                        System.out.print("Introduzca el nombre del participante a añadir: ");
                        nombre = sc.nextLine().trim();
                        participantes = añadir(participantes, nombre);
                        System.out.println(Arrays.toString(participantes));
                    }
                    case 4 -> {
                        System.out.print("Introduzca el nombre del participante que desea eliminar: ");
                        nombre = sc.nextLine().trim();
                        participantes = eliminar(participantes, nombre);
                        System.out.println(Arrays.toString(participantes));
                    }
                    case 5 -> {
                        String[] nombresOrdenados = new String[participantes.length];
                        nombresOrdenados = participantes;
                        Arrays.sort(nombresOrdenados);
                        System.out.println(Arrays.toString(nombresOrdenados));
                    }
                    case 6 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opcion no valida");
                }
            } while (opcion != 6);
        }
    }
}