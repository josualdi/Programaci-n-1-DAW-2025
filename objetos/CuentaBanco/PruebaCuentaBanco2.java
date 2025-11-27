package objetos.CuentaBanco;

public class PruebaCuentaBanco2 {
    public static void main(String[] args) {

        CuentaBanco a = new CuentaBanco((int) (Math.random() * 1000000000) + 1000000000, "Diego", 1000, "no");
        CuentaBanco b = new CuentaBanco((int) (Math.random() * 1000000000) + 1000000000, "Susana", 1000, "no");
        CuentaBanco c = new CuentaBanco((int) (Math.random() * 1000000000) + 1000000000, "Alejandra", 1000, "no");

        System.out.println("Numero de cuentas: " + CuentaBanco.getNumeroTotalCuentas());
        System.out.println("Saldo total de las cuentas: " + CuentaBanco.getSumaSaldosCuentas());

        a.retirarDinero(100);
        b.retirarDinero(100);
        c.retirarDinero(100);

        System.out.println("Numero de cuentas: " + CuentaBanco.getNumeroTotalCuentas());
        System.out.println("Saldo total de las cuentas: " + CuentaBanco.getSumaSaldosCuentas());

        a.imprimirDatos();
        b.imprimirDatos();
        c.imprimirDatos();
    }
}