
public class Main {
        public static void main(String[] args) {
                int array[] = new int[8];

                for (int i = 0; i < 3; i++) {
                        System.out.println(array[i]);
                }

                array[0] = 25;
                array[3] = 50;
                array[7] = 75;

                System.out.println("Primer elemento: " + array[0]);
                System.out.println("Cuarto elemento: " + array[3]);
                System.out.println("Ultimo elemento: " + array[7]);
                System.out.println("La longitud del array es de: " + array.length);

        }
}



