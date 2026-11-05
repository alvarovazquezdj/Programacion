import java.util.Arrays;

public class Ejercicio_01 {
        public static void main(String[] args) {
                int array[] = { 7, 2, 10, 4, 1, 9, 5, 3, 8, 6 };
                int aux = array[0];

                System.out.println(Arrays.toString(array));

                for (int i = 0; i < array.length - 1; i++) {
                        for (int j = 0; j < array.length - i - 1; j++) {
                                if (array[j + 1] < array[j]) {
                                        aux = array[j + 1];
                                        array[j + 1] = array[j];
                                        array[j] = aux;
                                }
                        }
                }

                System.out.println(Arrays.toString(array));
        }
}
