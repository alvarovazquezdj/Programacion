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
                prestado = true;
            }

            public void devolver() {
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

        System.out.println(l1.titulo);
        System.out.println(l1.autor);
        System.out.println(l1.paginas);
        System.out.println(l1.prestado);
        System.out.println(l1.esLibroLargo());

        System.out.println(l2.titulo);
        System.out.println(l2.autor);
        System.out.println(l2.paginas);
        System.out.println(l2.prestado);
        System.out.println(l2.esLibroLargo());

        l1.prestar();

        System.out.println(l1.prestado);

        l1.prestar();

        System.out.println(l1.prestado);

    }
}
