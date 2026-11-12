import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_01 {

    static double calcularMedia(double[] ventas) {
        return Arrays.stream(ventas).sum() / ventas.length;
    }

    static int buscarDiaMayorVenta(double[] ventas) {
        int diaMayorVenta = 0;

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[diaMayorVenta] < ventas[i]) {
                diaMayorVenta = i;
            }
        }
        return ++diaMayorVenta;
    }

    static int buscarDiaMenorVenta(double[] ventas) {
        int diaMenorVenta = 0;

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[diaMenorVenta] > ventas[i]) {
                diaMenorVenta = i;
            }
        }
        return ++diaMenorVenta;
    }

    static double[] obtenerVentasPeriodo(double[] ventas, int inicio, int fin) {
        return Arrays.copyOfRange(ventas, inicio - 1, fin);
    }

    public static void main(String[] args) {
        double[] ventas = new double[30];
        Scanner input = new Scanner(System.in);

        // 1. Solicite los importes de los 30 días, validando que ninguno sea negativo.
        for (int i = 0; i < ventas.length; i++) {
            while (true) {
                System.out.print("Introduce el importe para el dia " + (i + 1) + ": ");
                int valor = input.nextInt();

                if (valor >= 0) {
                    ventas[i] = valor;
                    break;
                } else {
                    System.out.println("No es posible introducir el valor " + valor + ".");
                }

            }
        }

        // 2. Calcule la recaudación total, la media diaria y el día con mayor y menor
        // recaudación.
        int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        System.out.print("La recaudacion total es: " + total);
        System.out.println("\nLa media es: " + calcularMedia(ventas));
        System.out.println("El dia con mayor recaudacion es: " + buscarDiaMayorVenta(ventas)
                + " y el dia con menor recaudacion es " + buscarDiaMenorVenta(ventas));

        // 3. Determine cuántos días se ha superado la media mensual.
        int mediaSuperada = 0;
        for (double venta : ventas) {
            if (venta > Arrays.stream(ventas).sum() / ventas.length) {
                mediaSuperada++;
            }
        }
        System.out.println("La media mensual se supero un total de: " + mediaSuperada + " dia/s.");

        // 4. Solicite al usuario dos números de día y cree un nuevo array con las
        // ventas correspondientes a ese intervalo, incluidos ambos extremos.
        System.out.println("\nIndica entre que periodo de fechas quieres ver las ventas.");
        int inicio;
        while (true) {
            System.out.print("Inicio: ");
            inicio = input.nextInt();
            if (inicio >= 1 && inicio <= ventas.length) {
                break;
            } else
                System.out.println("Inserta un numero comprendido entre 1 o " + ventas.length + ".");
        }
        int fin;
        while (true) {
            System.out.print("Fin: ");
            fin = input.nextInt();
            if (fin >= inicio && fin <= ventas.length) {
                break;
            } else
                System.out.println("Inserta un numero comprendido entre " + inicio + " o " + (ventas.length - 1) + ".");
        }

        double[] periodo = obtenerVentasPeriodo(ventas, inicio, fin);

        System.err.println("Las ventas entre los dias " + inicio + " y " + fin + " son: "
                + Arrays.toString(periodo));

        // 5. Calcule la recaudación y la media del intervalo seleccionado.
        System.out.println("La recaudacion total entre los dias " + inicio + " y " + fin + " es: "
                + Arrays.stream(periodo).sum());
        System.out.println(
                "La media entre los dias " + inicio + " y " + fin + " es: "
                        + Arrays.stream(periodo).sum()
                                / periodo.length);

        // 6. Cree una copia de las ventas del mes, la ordene de menor a mayor y muestre
        // los cinco importes más altos.
        double[] ventasOrdenada = Arrays.copyOf(ventas, ventas.length);
        Arrays.sort(ventasOrdenada);
        double[] mejores5Ventas = Arrays.copyOfRange(ventasOrdenada, ventasOrdenada.length - 5, ventasOrdenada.length);

        System.out.print("Las 5 importes mas altos son: " + Arrays.toString(mejores5Ventas));

        input.close();

    }
}