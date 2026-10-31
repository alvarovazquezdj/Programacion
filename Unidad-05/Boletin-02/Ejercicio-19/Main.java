
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                int array1[] = new int[10];
                Scanner input = new Scanner(System.in);


                for (int i = 0; i < array1.length; i++) {
                        System.out.print("Introduce el valor " + (i + 1) + ": ");
                        array1[i] = Integer.parseInt(input.nextLine());
                }

                int array2[] = new int[10];

                for (int i = 0; i < array2.length; i++) {
                        array2[i] = array1[i] * 2;
                }

                System.out.println("Array original: " + Arrays.toString(array1));
                System.out.println("Array duplicado: " + Arrays.toString(array2));





                input.close();
        }
}



