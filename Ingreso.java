import java.util.Scanner;

public class Ingreso {

    private static final String PIN_CORRECTO = "1234";
    private static final int MAX_INTENTOS = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean cuentaBloqueada = false;

        while (intentos < MAX_INTENTOS) {

            System.out.print("Ingrese su PIN: ");
            String pinIngresado = scanner.nextLine();

            if (pinIngresado.equals(PIN_CORRECTO)) {
                System.out.println("Acceso permitido. Bienvenido al menu principal.");
                return;
            } else {
                intentos++;
                System.out.println("PIN incorrecto.");

                if (intentos == MAX_INTENTOS) {
                    cuentaBloqueada = true;
                } else {
                    System.out.println("Intentos restantes: " + (MAX_INTENTOS - intentos));
                }
            }
        }

        if (cuentaBloqueada) {
            System.out.println("Cuenta bloqueada por seguridad.");
        }

        scanner.close();
    }
}