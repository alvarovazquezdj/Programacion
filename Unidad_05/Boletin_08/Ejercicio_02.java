
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_02 {

    static int numPiezasValidas(int[] piezas) {
        int numPiezasValidas = 0;
        for (int pieza : piezas) {
            if (pieza >= 245 && pieza <= 255) {
                numPiezasValidas++;
            }
        }
        return numPiezasValidas;
    }

    static int[] piezasDefectuoas(int[] piezas, int numPiezasValidas) {
        int[] piezasDefectuoas = new int[piezas.length - numPiezasValidas];
        int j = 0;

        for (int i = 0; i < piezas.length; i++) {
            if (piezas[i] < 245 || piezas[i] > 255) {
                piezasDefectuoas[j] = piezas[i];
                j++;
            }
        }

        return piezasDefectuoas;
    }

    static double mediaPiezasValidas(int[] piezas, int numPiezasValidas) {
        int totalPiezasValidas = 0;

        if (numPiezasValidas == 0) {
            return 0;
        }

        for (int pieza : piezas) {
            if (pieza >= 245 && pieza <= 255) {
                totalPiezasValidas += pieza;
            }
        }

        return (double) totalPiezasValidas / numPiezasValidas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] piezas = new int[20];

        // 1. Solicite los pesos de las 20 piezas, comprobando que sean positivos.
        for (int i = 0; i < piezas.length; i++) {
            System.out.print("Ingresa el peso de la pieza " + (i + 1) + ": ");

            int numero = sc.nextInt();
            while (numero <= 0) {
                System.out.print("Introduce un número positivo: ");
                numero = sc.nextInt();
            }
            piezas[i] = numero;
        }

        // 2. Muestre cuántas piezas cumplen las especificaciones y cuántas son
        // defectuosas.
        int numPiezasValidas = numPiezasValidas(piezas);
        System.out.println(
                "Existen un total de " + numPiezasValidas + " piezas que cumplen las especificaciones y un total de "
                        + (piezas.length - numPiezasValidas) + " piezas defectuosas.");

        // 3. Cree un array que contenga únicamente los pesos de las piezas defectuosas,
        // con el tamaño exacto necesario.
        System.out.println("Los pesos de las piezas defectuosas son: "
                + Arrays.toString(piezasDefectuoas(piezas, numPiezasValidas)));

        // 4. Calcule el peso medio de las piezas válidas.
        System.err.println("El peso medio de las piezas validas es: " + mediaPiezasValidas(piezas, numPiezasValidas));

        // 5. Busque la pieza cuyo peso esté más alejado del peso ideal e indique su
        // posición y la desviación.

        // 6. Solicite el número de una pieza y permita repetir su medición,
        // sustituyendo el valor anterior.
        // 7. Vuelva a calcular las estadísticas después de modificar la medición.
        
        sc.close();
    }
}