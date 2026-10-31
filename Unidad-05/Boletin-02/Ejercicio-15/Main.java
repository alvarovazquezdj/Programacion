import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                int array[] = new int[15];
                Scanner input = new Scanner(System.in);
                int mayor;
                int menor;
                int suma = 0;
                int positivo = 0;
                int negativo = 0;
                int cero = 0;
                int superiorMedia = 0;

                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i + 1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());
                }

                mayor = array[0];
                menor = array[0];

                for (int i = 0; i < array.length; i++) {
                        suma += array[i];
                        if (array[i] > mayor) {
                                mayor = array[i];
                        } else if (array[i] < menor) {
                                menor = array[i];
                        }

                        if (array[i] >= 0) {
                                positivo++;
                        } else {
                                negativo++;
                        }

                        if (array[i] == 0) {
                                cero++;
                        }
                }

                for (int i = 0; i < array.length; i++) {
                        if (array[i] > suma / array.length) {
                        superiorMedia++;
                }
                }

                System.err.println("La suma de todos los elementos es: " + suma);
                System.err.println("La media aritmÃ©tica es: " + (double)suma / array.length);
                System.out.println("El nÃºmero mayor es " + mayor + " y el menor es " + menor);
                System.out.println("La cantidad de nÃºmeros positivos es: " + positivo);
                System.out.println("La cantidad de nÃºmeros negativos es: " + negativo);
                System.out.println("La cantidad de ceros es: " + cero);
                System.out.println("El numero de elementos con valor superior a la media son: " + superiorMedia);

                input.close();
        }
}



