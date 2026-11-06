import java.util.Arrays;

public class Ejercicio_05 {
    static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 5, 1, 8};
        
        System.out.print("Elementos mostrados con for: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }

        System.out.print("\nElementos mostrados con for-each: ");
        for (int numero : numeros) {
            System.out.print(" " + numero);
        }

        int aux = 0;
        int maximo = numeros.length - 1;
        for (int i = 0; i < (numeros.length/2); i++) {
            aux = numeros[i];
            numeros[i] = numeros[maximo];
            numeros[maximo] = aux;
            maximo--;
        }

        System.out.println("\nElementos en orden inverso: " + Arrays.toString(numeros));

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("Suma de todos los elementos con for-each: " + suma);

        System.out.println("Media aritmetica: " + ((double)suma/numeros.length));


    }
}
