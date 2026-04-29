import java.util.Scanner;

public class Transferir {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 500000;

        System.out.print("Ingrese el número de cuenta destino: ");
        String cuentaDestino = scanner.nextLine();

        System.out.print("Ingrese el monto a transferir: ");
        double monto = scanner.nextDouble();

        if (monto > 0 && monto <= saldo) {
            saldo -= monto;

            System.out.println("Transferencia realizada con éxito.");
            System.out.println("Cuenta destino: " + cuentaDestino);
            System.out.println("Saldo restante: $" + saldo);

        } else {
            System.out.println("No se pudo realizar la transferencia.");
        }

        scanner.close();
    }
}