import java.util.Scanner;

public class ConsultarSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulación de saldo (usuario ya autenticado)
        double saldo = 500000;

        System.out.println("=== CONSULTA DE SALDO ===");

        System.out.println(" Su saldo actual es: $" + saldo);

        scanner.close();
    }
}
