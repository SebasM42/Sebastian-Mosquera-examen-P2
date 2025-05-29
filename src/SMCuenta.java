public class SMCuenta {
    protected double saldo;
    protected int numeroDepositos;
    protected int numeroRetiros;
    protected double tasaAnual;

    public SMCuenta(double saldoInicial) {
        this.saldo = saldoInicial;
        this.numeroDepositos = 0;
        this.numeroRetiros = 0;
        this.tasaAnual = 0.0;
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