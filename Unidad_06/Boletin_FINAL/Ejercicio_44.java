
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_44 {

    static int añadir(String[] nombres, Integer[] numeros, String[] correos, int numContactos, Scanner sc) {
        if (numContactos == 30) {
            System.out.println("La agenda esta llena.");
            return numContactos;
        }

        while (true) {
            System.out.print("Nombre: ");
            String entrada = sc.nextLine().trim();

            if (entrada.isEmpty()) {
                System.out.println("El nombre no puede estar vacio.");
                continue;
            }

            boolean repetido = false;

            for (int i = 0; i < numContactos; i++) {
                if (nombres[i].equalsIgnoreCase(entrada)) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Ya existe un contacto con ese mismo nombre.");
                continue;
            }

            nombres[numContactos] = entrada;
            break;
        }

        while (true) {
            System.out.print("Telefono: ");
            int entrada = sc.nextInt();
            sc.nextLine();

            if (String.valueOf(entrada).length() != 9) {
                System.out.println("El numero de telefono debe de estar formado por 9 digitos.");
                continue;
            }

            numeros[numContactos] = entrada;
            break;
        }

        while (true) {
            System.out.print("Correo: ");
            String entrada = sc.nextLine();

            if (entrada.isEmpty()) {
                System.out.println("El correo no puede estar vacio.");
                continue;
            }

            if (!entrada.endsWith("@gmail.com")) {
                System.out.println("El correo debe de terminar con '@gmail.com'");
                continue;
            }

            if (entrada.equals("@gmail.com")) {
                System.out.println("El correo no puede ser solo '@gmail.com'");
                continue;
            }

            correos[numContactos] = entrada;
            break;
        }

        System.out.println("Contacto agregado correctamente.");
        return ++numContactos;
    }

    static void buscar(String[] nombres, int numContactos, Scanner sc) {
        String entrada;
        String encontrados = "";

        if (numContactos == 0) {
            System.out.println("La agenda esta vacia.");
            return;
        }

        while (true) {
            System.out.print("Buscador: ");
            entrada = sc.nextLine().toLowerCase().trim();

            if (entrada.isEmpty()) {
                System.out.println("El nombre no puede estar vacio.");
                continue;
            }

            for (int i = 0; i < numContactos; i++) {
                if (nombres[i].toLowerCase().contains(entrada)) {
                    if (encontrados.isEmpty()) {
                        encontrados += nombres[i];
                    } else {
                        encontrados += ", " + nombres[i];
                    }
                }
            }

            if (encontrados.isEmpty()) {
                System.out.println("Ningun contacto encontrado.");
                break;
            }

            System.out.println("Contacto/s encontrado/s: " + encontrados);
            break;
        }
    }

    static void modificarTelefono(String[] nombres, Integer[] numeros, int numContactos, Scanner sc) {
        String entradaNombre;
        int entradaTelefono;
        int encontrado = -1;

        while (true) {
            System.out.println("Contactos guardados: ");
            for (int i = 0; i < numContactos; i++) {
                System.out.println(nombres[i] + ": " + numeros[i]);
            }

            System.out.print("Introduzca el contacto que desea modificar: ");
            entradaNombre = sc.nextLine();
            for (int i = 0; i < numContactos; i++) {
                if (nombres[i].equalsIgnoreCase(entradaNombre)) {
                    encontrado = i;
                    break;
                }
            }

            if (encontrado == -1) {
                System.out.println("El contacto introducido no existe.");
                continue;
            }

            break;
        }

        while (true) {
            System.out.println("Modificando el contacto '" + nombres[encontrado] + "'.");
            System.out.println("Numero actual: " + numeros[encontrado]);
            System.out.print("Numero nuevo: ");
            entradaTelefono = sc.nextInt();
            sc.nextLine();

            if (String.valueOf(entradaTelefono).length() != 9) {
                System.out.println("El numero de telefono debe de estar formado por 9 digitos.");
                continue;
            }

            System.out.println("Contacto editado correctamente.");
            numeros[encontrado] = entradaTelefono;
            break;
        }
    }

    static int eliminar(String[] nombres, Integer[] numeros, String[] correos, int numContactos, Scanner sc) {
        String entrada;

        while (true) {
            System.out.print("Contactos guardados: ");
            for (int i = 0; i < numContactos; i++) {
                if (i == numContactos - 1) {
                    System.out.print(nombres[i]);
                } else {
                    System.out.print(nombres[i] + ", ");
                }
            }

            System.out.print("\nIntroduzca el contacto que desea eliminar: ");
            entrada = sc.nextLine();
            boolean encontrado = false;
            for (int i = 0; i < numContactos; i++) {
                if (nombres[i].equalsIgnoreCase(entrada) || encontrado) {
                    encontrado = true;

                    nombres[i] = nombres[i + 1];
                    numeros[i] = numeros[i + 1];
                    correos[i] = correos[i + 1];
                }
            }

            if (encontrado) {
                nombres[numContactos - 1] = "";
                numeros[numContactos - 1] = null;
                correos[numContactos - 1] = "";
            }

            if (!encontrado) {
                System.out.println("El contacto introducido no existe.");
                return numContactos;
            }

            System.out.println("Contacto eliminado correctamente.");
            return --numContactos;
        }
    }

    static void mostrarOrdenados(String[] nombres, int numContactos, Scanner sc) {
        String[] nombresOrdenados = Arrays.copyOf(nombres, numContactos);
        Arrays.sort(nombresOrdenados);
        String ordenados = "";

        for (String nombreOrdenado : nombresOrdenados) {
            if (ordenados.isEmpty()) {
                ordenados += nombreOrdenado;
            } else {
                ordenados += ", " + nombreOrdenado;
            }
        }

        System.out.println("Lista de contactos ordenados: " + ordenados);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion = -1;
            int numContactos = 0;
            String[] nombres = new String[30];
            Integer[] numeros = new Integer[30];
            String[] correos = new String[30];

            do {
                System.out.println("========== MENU ==========");
                System.out.println("1. Añadir");
                System.out.println("2. Buscar");
                System.out.println("3. Modificar telefono");
                System.out.println("4. Eliminar");
                System.out.println("5. Mostrar ordenados");
                System.out.println("6. Salir");
                System.out.print("Elige una opcion: ");

                try {
                    opcion = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("Debes introducir un numero.");
                    continue;
                }

                switch (opcion) {
                    case 1 -> numContactos = añadir(nombres, numeros, correos, numContactos, sc);
                    case 2 -> buscar(nombres, numContactos, sc);
                    case 3 -> modificarTelefono(nombres, numeros, numContactos, sc);
                    case 4 -> numContactos = eliminar(nombres, numeros, correos, numContactos, sc);
                    case 5 -> mostrarOrdenados(nombres, numContactos, sc);
                    case 6 -> System.out.println("Saliendo...");

                    default -> System.out.println("Opcion no valida");

                }
            } while (opcion != 6);
        }
    }
}