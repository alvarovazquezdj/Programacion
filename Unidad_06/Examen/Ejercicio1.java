import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] ventas = {125.50, 89.99, 210.00, 175.25, 95.00, 310.50, 145.75, 220.00, 78.50, 190.00};

        System.out.println(Arrays.toString(ventas));

        double sumaTotal = 0;
        double ventaMayor = ventas[0];
        int diaMayor = -1;
        
        for (int i = 0; i < ventas.length; i++) {
            if (ventaMayor < ventas[i]) {
                ventaMayor = ventas[i];
                diaMayor = i + 1;
            }
            sumaTotal += ventas[i];
        }

        int numVentSupMedia = 0;

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > sumaTotal / ventas.length) {
                numVentSupMedia++;
            }
        }

        double[] ventasSuperiorMedia = new double[numVentSupMedia];
        int j = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > sumaTotal / ventas.length) {
                ventasSuperiorMedia[j] = ventas[i];
                j++;
            }
        }

        Arrays.sort(ventasSuperiorMedia);

        System.out.println("Importe medio ventas: " + sumaTotal / ventas.length);
        System.out.println("El dia " + diaMayor + " fue el dia con la venta mas alta: " + ventaMayor);
        System.out.println("Los dias con ventas superiores a la media ordenados de menor a mayor son: " + Arrays.toString(ventasSuperiorMedia));



    }
}