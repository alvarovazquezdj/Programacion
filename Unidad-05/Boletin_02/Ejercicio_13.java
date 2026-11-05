
import java.util.Scanner;


public class Ejercicio_13 {
        public static void main(String[] args) {
                int array[] = new int[12];
                Scanner input = new Scanner(System.in);
                int par = 0;
                int impar = 0;

                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i+1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());

                        if (array[i] % 2 == 0) {
                                par++;
                        } else {
                                impar++;
                        }
                }

                System.out.println("Total de numeros pares: " + par);
                System.out.println("Total de numeros impares: " + impar);



                input.close();
        }
}



