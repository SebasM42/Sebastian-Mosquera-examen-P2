public class SMCuentaAhorro extends SMCuenta {
    public SMCuentaAhorro(double saldoInicial) {
        super(saldoInicial);
    }
    public String imprimir() {
        return String.format(
                "Saldo: %.2f\nNúmero de depósitos: %d\nNúmero de retiros: %d\nTasa anual: %.2f%%", saldo, numeroDepositos, numeroRetiros, tasaAnual
        );
    }
}