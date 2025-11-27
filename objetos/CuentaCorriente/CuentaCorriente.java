package objetos.CuentaCorriente;

public class CuentaCorriente {
    private int numCuenta;
    private int saldo;

    public CuentaCorriente(String numeroCuenta) {
        numCuenta = Integer.parseInt(numeroCuenta);
    }

    public void ingresaEfectivo(double cantidad) {
        saldo += cantidad;
        System.out.println("Importe ingresado. Muchas Gracias");
    }

    public boolean retiraEfectivo(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void visualiza() {
        System.out.println("Numero de Cuenta: 00" + numCuenta);
        System.out.println("Saldo: " + saldo);
    }
}
