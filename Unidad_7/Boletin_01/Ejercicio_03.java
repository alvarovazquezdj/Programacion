public class Ejercicio_03 {
    public static void main(String[] args) {
        class Alumno {
            String nombre;
            int nota1;
            int nota2;
            int nota3;

            double calcularMedia() {
                return (nota1+nota2+nota3) / 3.0;
            }

            boolean estaAprobado() {
                return calcularMedia() >= 5;
            }   

            void mostrarBoletin() {
                System.out.println("Nombre: " + nombre);
                System.out.println("Nota 1: " + nota1);
                System.out.println("Nota 2: " + nota2);
                System.out.println("Nota 3: " + nota3);
                System.out.println("Media: " + calcularMedia());
                System.out.println("Esta aprobado: " + estaAprobado());

            }
        }

        Alumno a1 = new Alumno();
        a1.nombre = "Alvaro";
        a1.nota1 = 5;
        a1.nota2 = 7;
        a1.nota3 = 8;

        Alumno a2 = new Alumno();
        a2.nombre = "Carlos";
        a2.nota1 = 3;
        a2.nota2 = 3;
        a2.nota3 = 4;

        Alumno a3 = new Alumno();
        a3.nombre = "Manuel";
        a3.nota1 = 10;
        a3.nota2 = 7;
        a3.nota3 = 8;

        a1.mostrarBoletin();
        System.out.println("--------------------");
        a2.mostrarBoletin();
        System.out.println("--------------------");
        a3.mostrarBoletin();
  
    }
}