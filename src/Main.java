import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un monto inicial: ");
        double saldoInicial = scanner.nextDouble();
        SMCuentaAhorro cuenta = new SMCuentaAhorro(saldoInicial);

        int opcion;
        do {
            System.out.println("\n------------ Menu --------------");
            System.out.println("1 Depositar");
            System.out.println("2 Retirar");
            System.out.println("3 Ver saldo");
            System.out.println("4 Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (cuenta.retirar(retiro)) {
                        System.out.println("Retiro realizado.");
                    } else {
                        System.out.println("Monto inválido o saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("El saldo actual es: %.2f\n", cuenta.imprimir());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}