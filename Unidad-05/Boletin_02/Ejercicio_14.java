import java.util.Scanner;

public class Ejercicio_14 {
        public static void main(String[] args) {
                int array[] = new int[10];
                Scanner input = new Scanner(System.in);
                int mayor;
                int menor;
                int posMayor = 0;
                int posMenor = 0;

                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i + 1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());
                }

                mayor = array[0];
                menor = array[0];

                for (int i = 0; i < array.length; i++) {
                        if (array[i] > mayor) {
                                mayor = array[i];
                                posMayor = i;
                        } else if (array[i] < menor) {
                                menor = array[i];
                                posMenor = i;
                        }
                }

                System.out.println("El nÃºmero mayor es " + mayor + " y su posicion es " + posMayor);
                System.out.println("El nÃºmero menor es " + menor + " y su posicion es " + posMenor);

                input.close();
        }
}



