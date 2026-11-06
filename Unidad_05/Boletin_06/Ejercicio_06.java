public class Ejercicio_06 {

    static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 5, 1, 8, 5, 1, 9};

        System.out.print("\nArray completo: ");
        for (int numero : numeros) {
            System.out.print(" " + numero);
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (mayor > numero) {
                mayor = numero;
            } else if (menor < numero) {
                menor = numero;
            }
        }

        System.out.println("\nNumero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("\nSuma de todos los elementos: " + suma);

        System.out.println("Media aritmetica: " + ((double) suma / numeros.length));

        int superiorMedia = 0;
        for (int numero : numeros) {
            if (numero > ((double) suma / numeros.length)) {
                superiorMedia++;
            }
        }
        System.out.println("Total elementos superiores a la media: " + superiorMedia);

    }
}
