
public class Ejercicio_01 {

        static void duplicarValores(int[] numeros) {
                for (int i = 0; i < numeros.length; i++) {
                        numeros[i] *= 2;
                }
        }

        public static void main(String[] args) {
                int array[] = {2, 4, 6, 8, 10};

                System.out.print("Array original: ");
                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                }
                duplicarValores(array);

                System.out.print("\nArray duplicado: ");
                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                }

        }
}
