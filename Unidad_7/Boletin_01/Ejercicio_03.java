public class Ejercicio_03 {
    public static void main(String[] args) {
        class Alumno {
            String nombre;
            int nota1;
            int nota2;
            int nota3;

            double calcularMedia() {
                return ((nota1+nota2+nota3) / 3);
            }

            boolean estaAprobado() {
                if (calcularMedia() >= 5) {
                    return true;
                }

                return false;
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
        a1.nota1 = 3;
        a1.nota1 = 8;

        Alumno a2 = new Alumno();
        a2.nombre = "Carlos";
        a2.nota1 = 9;
        a2.nota1 = 3;
        a2.nota1 = 4;

        Alumno a3 = new Alumno();
        a3.nombre = "Manuel";
        a3.nota1 = 5;
        a3.nota1 = 7;
        a3.nota1 = 8;

        a1.mostrarBoletin();
        a2.mostrarBoletin();
        a3.mostrarBoletin();

        for (int i = 0; i < args.length; i++) {
            
        }

    }
}