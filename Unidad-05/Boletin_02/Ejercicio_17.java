
import java.util.Scanner;

public class Ejercicio_17 {
        public static void main(String[] args) {
                int array[] = new int[15];
                Scanner input = new Scanner(System.in);
                int numero = 0;
                boolean encontrado = false;
                int aparicionNumero = 0;

                for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor " + (i + 1) + ": ");
                        array[i] = Integer.parseInt(input.nextLine());
                }

                System.out.print("Introduce el numero que quieres buscar: ");
                numero = Integer.parseInt(input.nextLine());

                System.out.println("NÃºmero buscado: " + numero);

                for (int i = 0; i < array.length; i++) {
                        if (array[i] == numero) {
                                aparicionNumero++;
                        }
                }

                System.out.println("El nÃºmero " + numero + " aparece " + aparicionNumero + " veces.");
                String resultado = "Posiciones: ";

                for (int i = 0; i < array.length; i++) {
                        if (array[i] == numero) {
                                resultado += i + ", ";
                                encontrado = true;
                        }
                }

                resultado = resultado.substring(0, resultado.length() -2);
                System.out.println(resultado);

                if (!encontrado) {
                        System.out.println("Numero no encontrado!");
                }

                input.close();
        }
}



