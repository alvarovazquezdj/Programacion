
import java.util.Arrays;


public class Ejercicio_02 {
    static void main(String[] args) {
        int[] numeros = new int[10];
        
        Arrays.fill(numeros, -1);
        System.out.println("Array completo: " + Arrays.toString(numeros));

        numeros[2] = 20;
        numeros[5] = 50;
        numeros[8] = 80;

        System.out.println("Array modificado: " + Arrays.toString(numeros));
    }
}
