public class SMCuentaAhorro extends SMCuenta {
    public SMCuentaAhorro(double saldoInicial) {
        super(saldoInicial);
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            numeroDepositos++;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            numeroRetiros++;
            return true;
        }
        return false;
    }

    public String imprimir() {
        return String.format(
                "Saldo: %.2f\nNúmero de depósitos: %d\nNúmero de retiros: %d\nTasa anual: %.2f%%", saldo, numeroDepositos, numeroRetiros, tasaAnual
        );
    }
}