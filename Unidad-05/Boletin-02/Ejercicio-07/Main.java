
import java.util.Scanner;



public class Main {
        public static void main(String[] args) {
                int array[] = new int[10];
                Scanner input = new Scanner(System.in);

                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introducir valor "+ (i+1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());
                }

                for (int i = 0; i < array.length; i++) {
                        System.out.println("La posicion " + i + " es: " + array[i]);
                }


                input.close();
        }
}



