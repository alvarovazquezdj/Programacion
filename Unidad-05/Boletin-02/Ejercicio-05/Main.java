

public class Main {
        public static void main(String[] args) {
                int array[] = {5, 10, 15, 20};

                System.out.println("Array antes del cambio:");
                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);
                System.out.println(array[3]);

                int pos0 = array[0];
                int ultimaPosicion = array.length -1;
                array[0] = array[array.length -1];

                array[ultimaPosicion] = pos0;

                System.out.println("Array despues del cambio:");
                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);
                System.out.println(array[3]);
        }
}



