
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(
                "123456789",
                "Juan Perez",
                100000
        );

        CajeroAutomatico cajero = new CajeroAutomatico(cuenta);

        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cajero.extraerDinero(20000);
        cajero.extraerDinero(90000);

        cajero.depositarDinero(5000);

        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}