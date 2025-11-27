package objetos.Herencia;

public class CuentaAhorro {
    private double interes;
    private Cuenta cnt;

    public CuentaAhorro(String numC, String titular, double interes) {
        cnt = new Cuenta(Integer.parseInt(numC), titular);

        if (interes >= 0 && interes <= 100) {
            this.interes = interes;
        } else {
            this.interes = 0;
        }
    }

    public Cuenta getCuenta() {
        return cnt;
    }

    public void aplicaInteres() {
        if (cnt.bloqueada == false) {
            cnt.saldo += ((cnt.getSaldo() * interes) / 100);
            System.out.println("Interes aplicado");
        } else {
            System.out.println("La cuenta esta bloqueada");
        }
    }
}