public class SMCuentaAhorro extends SMCuenta {
    private boolean activa;

    public SMCuentaAhorro(double saldoInicial) {
        super(saldoInicial);
        this.activa = saldoInicial > 0;
    }


    public void cuentaAhorros(float saldo, float tasa) {
        this.saldo = saldo;
        this.tasaAnual = tasa;
        this.activa = saldo > 0;
    }


    public void depositar(float numeroDepositos) {
        if (numeroDepositos > 0) {
            this.saldo += numeroDepositos;
            this.numeroDepositos++;
            this.activa = this.saldo > 0;
        }
    }


    public void retirar(float numeroRetiros) {
        if (numeroRetiros > 0 && numeroRetiros <= this.saldo) {
            this.saldo -= numeroRetiros;
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