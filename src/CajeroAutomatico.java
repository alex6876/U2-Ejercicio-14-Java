public class CajeroAutomatico {
    CuentaBancaria cuentaActiva;

    public CajeroAutomatico(CuentaBancaria cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public void extraerDinero(double monto){
        if(cuentaActiva.debitar(monto)){
            System.out.println("Dinero extraido");
        }else {
            System.out.println("Dinero insuficiente");
        }
    }

    public void depositarDinero(double monto){
        if(monto > 0){
            cuentaActiva.acreditar(monto);
            System.out.println("Dinero depositado: $" + monto);
        }else  {
            System.out.println("Deposito rechazado.");
        }
    }
}
