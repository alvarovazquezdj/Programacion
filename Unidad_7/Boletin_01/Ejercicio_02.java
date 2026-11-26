public class Ejercicio_02 {
    public static void main(String[] args) {
        class Libro {
            String titulo;
            String autor;
            int paginas;
            boolean prestado;

            public void mostrarInformacion() {
                System.out.println("Titulo: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Paginas: " + paginas);
                System.out.println("Prestado: " + prestado);
            }

            public void prestar() {
                if (prestado == true) {
                    System.out.println("Error. Este libro esta prestado actualmente.");
                    return;
                }

                prestado = true;
            }

            public void devolver() {
                if (prestado == false) {
                    System.out.println("Error. Este libro esta devuelto actualmente.");
                    return;
                }

                prestado = false;
            }

            public boolean esLibroLargo() {
                return paginas >= 300;
            }
        }

        Libro l1 = new Libro();
        l1.titulo = "Libro 1";
        l1.autor = "Alberto";
        l1.paginas = 250;
        l1.prestado = false;

        Libro l2 = new Libro();
        l2.titulo = "Libro 2";
        l2.autor = "Alvaro";
        l2.paginas = 350;
        l2.prestado = true;

        l1.mostrarInformacion();
        System.out.println("Tiene mas de 100 paginas?: " + l1.esLibroLargo());
        System.out.println("--------------------");
        l2.mostrarInformacion();
        System.out.println("Tiene mas de 100 paginas?: " + l2.esLibroLargo());

        l2.devolver();

        l1.prestar();
        l1.prestar();

    }
}
