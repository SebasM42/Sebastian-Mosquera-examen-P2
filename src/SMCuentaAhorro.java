public class SMCuentaAhorro extends SMCuenta {
    private boolean activa;

    public SMCuentaAhorro(double saldoInicial, float tasa) {
        super(saldoInicial);
        this.activa = saldoInicial > 0;
    }

    public void depositar(float monto) {
        if (monto > 0) {
            this.saldo += monto;
            this.numeroDepositos++;
            this.activa = this.saldo > 0;
        }
    }

    public void retirar(float monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            this.numeroRetiros++;
            this.activa = this.saldo > 0;
        }
    }

    public String imprimir() {
        return String.format(
                "Saldo: %.2f\nNúmero de depósitos: %d\nNúmero de retiros: %d\nTasa anual: %.2f%%\nActiva: %b",
                saldo, numeroDepositos, numeroRetiros, tasaAnual, activa
        );
    }
}