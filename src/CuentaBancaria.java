public class CuentaBancaria {
    private String cbu;
    private String titulares;
    private double saldo;

    public CuentaBancaria(String cbu, String titulares, double saldo) {
        this.cbu = cbu;
        this.titulares = titulares;
        this.saldo = saldo;
    }

    public boolean debitar(double monto) {
        if (monto <= 0 || monto > saldo || monto > 50000) {
            return false;
        }

        saldo = saldo - monto;
        return true;
    }

    public void acreditar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCbu() {
        return cbu;
    }

    public String getTitulares() {
        return titulares;
    }
}