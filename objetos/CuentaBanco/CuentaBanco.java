package objetos.CuentaBanco;

public class CuentaBanco {
    private int numero;
    private String titular;
    private double saldo;
    private boolean bloqueada;
    private static int cantidad = 0;
    private static int suma = 0;

    public static int getNumeroTotalCuentas() {
        return cantidad;
    }

    public static double getSumaSaldosCuentas() {
        return suma;
    }

    public CuentaBanco(int numCuenta, String titularCuenta, int dinero, String bloq) {
        cantidad++;
        suma += dinero;
        titular = titularCuenta;
        numero = numCuenta;
        saldo = dinero;
        if (bloq.equalsIgnoreCase("si")) {
            bloqueada = true;
        } else {
            bloqueada = false;
        }
    }

    public int numeroCuenta() {
        return numero;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String nombreTitular() {
        return titular;
    }

    public void ingresarDinero(double ingreso) {
        if (!bloqueada) {
            saldo += ingreso;
            System.out.println("Has ingresado " + ingreso + " €. Saldo actual: " + saldo);
        } else {
            System.out.println("No puede hacer operaciones. La cuenta está bloqueada.");
        }
    }

    public void retirarDinero(double retiro) {
        if (!bloqueada) {
            if (saldo - retiro < 0) {
                System.out.println("Error: intentas retirar más dinero del que tienes.");
            } else {
                suma -= retiro;
                saldo -= retiro;
                System.out.println("Has retirado " + retiro + ". Saldo actual: " + saldo);
            }
        } else {
            System.out.println("No puede hacer operaciones. La cuenta está bloqueada.");
        }
    }

    public void cambioTitular(String newTitular) {
        if (!bloqueada) {
            if (newTitular.isEmpty()) {
                System.out.println("No has introducido un titular.");
            } else {
                titular = newTitular;
                System.out.println("Titular cambiado a: " + titular);
            }
        } else {
            System.out.println("No puede cambiar de titular. La cuenta está bloqueada.");
        }
    }

    public void bloquear() {
        if (bloqueada) {
            System.out.println("La cuenta ya está bloqueada.");
        } else {
            bloqueada = true;
            System.out.println("Cuenta bloqueada.");
        }
    }

    public void desbloquear() {
        if (!bloqueada) {
            System.out.println("La cuenta ya está desbloqueada.");
        } else {
            bloqueada = false;
            System.out.println("Cuenta desbloqueada.");
        }
    }

    public void imprimirDatos() {
        System.out.println("Número de cuenta: ES" + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Estado: " + (bloqueada ? "Bloqueada" : "Desbloqueada"));
    }
}