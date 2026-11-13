
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_14 {

    static boolean entradaVehiculo(int[] plazas, int numPlazasOcupadas, int matricula) {
        for (int i = 0; i < numPlazasOcupadas; i++) {
            if (plazas[i] == matricula) {
                System.out.println(
                        "No es posible registrar el vehiculo, la matricula " + matricula + " ya esta registrada.");
                return false;
            }
        }

        plazas[numPlazasOcupadas] = matricula;
        System.out.println("Vehiculo con matricula " + matricula + " registrado con exito.");
        return true;
    }

    static int salidaVehiculo(int[] plazas, int numPlazasOcupadas, int matricula) {
        if (numPlazasOcupadas == 0) {
            System.out.println("La matricula indicada no existe, el garaje esta vacio.");
            return numPlazasOcupadas;
        }

        for (int i = 0; i < numPlazasOcupadas; i++) {
            if (plazas[i] == matricula) {
                for (int j = i; j < numPlazasOcupadas - 1; j++) {
                    plazas[j] = plazas[j + 1];
                }

                numPlazasOcupadas--;
                plazas[numPlazasOcupadas] = 0;
                System.out.println("Vehiculo con matricula " + matricula + " sacado con exito.");
                return numPlazasOcupadas;
            }
        }

        System.out.println("La matricula indicada no existe.");
        return numPlazasOcupadas;
    }

    static int buscarVehiculo(int[] plazas,  int matricula) {
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == matricula) {
                return i;
            }
        }

        System.out.println("El vehiculo con matricula " + matricula + " no existe.");
        return -1;
    }

    static double calcularPrecio(int horas) {
        if (horas >= 1 && horas <= 2) {
            return horas * 2;
        } else if (horas >= 3 && horas <= 5) {
            return horas * 1.5;
        } else {
            return horas * 1;
        }
    }

    static int[] obtenerMatriculas(int[] plazas) {
        int[] plazasOcupadas = new int[plazas.length];
        int numPlazasOcupadas = 0;

        for (int i = 0; i < plazasOcupadas.length; i++) {
            if (plazas[i] != 0) {
                plazasOcupadas[numPlazasOcupadas] = plazas[i];
                numPlazasOcupadas++;
            }
        }

        return plazasOcupadas;
    }

    static int buscarPlazaLibre(int[] plazas) {
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == 0) {
                return i;
            }
        }

        System.out.println("No quedan plazas libres.");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numPlazasOcupadas = 0;
        int[] plazas = new int[20];
        int matricula;
        int opcion;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Entrada vehiculo");
            System.out.println("2. Salida vehiculo");
            System.out.println("3. Buscar vehiculo");
            System.out.println("4. Buscar plaza libre");
            System.out.println("5. Calcular precio");
            System.out.println("6. Obtener matriculas");
            System.out.println("7. Obtener matriculas ordenadas");
            System.out.println("8. Buscar plaza libre");
            System.out.println("9. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la matricula del vehiculo que desea ingresar: ");
                    matricula = sc.nextInt();
                    if (numPlazasOcupadas == plazas.length) {
                        System.out.println("No es posible ingresar el vehiculo, el parking esta completo.");
                    }
                    
                    if (entradaVehiculo(plazas, numPlazasOcupadas, matricula)) {
                        numPlazasOcupadas++;
                    }
                    break;

                case 2:
                    System.out.print("Introduce la matricula del vehiculo que desea sacar: ");
                    matricula = sc.nextInt();
                    numPlazasOcupadas = salidaVehiculo(plazas, numPlazasOcupadas, matricula);
                    break;

                case 3:
                    if (numPlazasOcupadas == 0) {
                        System.out.println("El garaje esta vacio.");
                        break;
                    }
                    System.out.print("Introduce la matricula del vehiculo que desea buscar: ");
                    matricula = sc.nextInt();
                    Integer pos = buscarVehiculo(plazas, numPlazasOcupadas, matricula);
                    if (pos != -1) {
                        System.out.println("El vehiculo con matricula " + matricula + "  se encuentra en la posicion "
                                + pos + ".");
                    }

                    break;

                case 4:
                    int plazaLibre = buscarPlazaLibre(plazas);
                    System.out.println("La siguiente plaza libre es la numero " + plazaLibre);
                    break;

                case 5:
                    int horas;

                    do {
                        System.out.print("Ingrese el numero de horas que estuvo estacionado: ");
                        horas = sc.nextInt();
                    } while (horas <= 0);

                    double precioCalculado = calcularPrecio(horas);
                    System.out.println("El importe correspondiente es de: " + precioCalculado);
                    break;

                case 6:
                    if (numPlazasOcupadas == 0) {
                        System.out.println("El garaje esta vacio.");
                        break;
                    }
                    int[] plazasOcupadas = obtenerMatriculas(plazas, numPlazasOcupadas);
                    System.out.println(
                            "Las matriculas de los vehiculos aparcados son: " + Arrays.toString(plazasOcupadas));
                    break;

                case 7:
                    if (numPlazasOcupadas == 0) {
                        System.out.println("El garaje esta vacio.");
                        break;
                    }
                    plazasOcupadas = Arrays.copyOfRange(plazas, 0, numPlazasOcupadas);
                    Arrays.sort(plazasOcupadas);
                    System.out.println("Las matriculas ordenadas de los vehiculos aparcados son: "
                            + Arrays.toString(plazasOcupadas));

                    break;

                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 9);

        sc.close();
    }
}
