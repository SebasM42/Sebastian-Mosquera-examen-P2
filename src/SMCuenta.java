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
}