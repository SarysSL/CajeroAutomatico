import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000.0; // saldo inicial
        double retiro;

        System.out.println("=== CAJERO AUTOMATICO ===");
        System.out.println("Saldo disponible: $" + saldo);

        System.out.print("Ingrese el monto a retirar: ");
        retiro = sc.nextDouble();

        // Validaciones
        if (retiro <= 0) {
            System.out.println("Monto inválido.");
        } else if (retiro > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo = saldo - retiro;
            System.out.println("Retiro exitoso.");
            System.out.println("Saldo restante: $" + saldo);
        }

        sc.close();
    }
}
