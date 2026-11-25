public class Ejercicio_01 {

    public static void main(String[] args) {

        class Coche {
            String marca;
            String modelo;
            int velocidad;

            public void acelerar(int cantidad) {
                velocidad = velocidad + cantidad;
            }

            public void frenar(int cantidad) {
                if (velocidad - cantidad < 0) {
                    System.out.println("No es posible reducir la velocidad, el coche ya esta parado.");
                    return;
                }

                velocidad = velocidad - cantidad;
            }
        }

        Coche c1 = new Coche();
        c1.marca = "MG";
        c1.modelo = "ZS";
        c1.velocidad = 0;

        System.out.println(c1.marca);
        System.out.println(c1.modelo);
        System.out.println(c1.velocidad);

        c1.acelerar(5);

        System.out.println(c1.velocidad);

        c1.frenar(3);

        System.out.println(c1.velocidad);
        c1.frenar(3);
    }
}