public class Ejercicio_04 {
    public static void main(String[] args) {
        class CuentaBancaria {
            String titular;
            int saldo;

            void ingresar(double cantidad) {
                if (saldo < 0) {
                    System.out.println("Error en cuenta " + titular + ". Actualmente esta cuenta tiene saldo negativo.");
                    return;
                }

                saldo += cantidad;
            }

            void retirar(double cantidad) {
                if (saldo < 0) {
                    System.out.println("Error en cuenta " + titular + ". Actualmente esta cuenta tiene saldo negativo.");
                    return;
                }

                if (cantidad > saldo) {
                    System.out.println("Error en cuenta " + titular + ". El saldo actual de la cuenta es inferior al que desea retirar.");
                    return;
                }

                saldo -= cantidad;
            }

            void mostrarSaldo() {
                System.out.println(saldo);
            }
        }

        CuentaBancaria cb1 = new CuentaBancaria();
        cb1.titular = "Alvaro";
        cb1.saldo = 10000;

        CuentaBancaria cb2 = new CuentaBancaria();
        cb2.titular = "Carlos";
        cb2.saldo = 15000;

        cb1.ingresar(500);
        cb2.retirar(500);

        cb2.retirar(15000);

        System.out.print("Saldo cuenta " + cb1.titular + ": ");
        cb1.mostrarSaldo();
        System.out.print("Saldo cuenta " + cb2.titular + ": ");
        cb2.mostrarSaldo();

    }
}