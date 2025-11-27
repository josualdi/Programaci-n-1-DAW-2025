package objetos.Herencia;

public class Cuenta {
    private String numero;
    private String titular;
    protected double saldo;
    protected boolean bloqueada;

    public Cuenta(int numC, String titularC) {
        numero = Integer.toString(numC);
        titular = titularC;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numero;
    }

    public void cambiarTitular(String nom) {
        titular = nom;
    }

    public void ingresarDinero(double dinero) {
        saldo += dinero;
    }

    public void retirarDinero(double dinero) {
        if (saldo - dinero < 0) {
            System.out.println("No tienes suficiente dinero");
        } else {
            saldo -= dinero;
            System.out.println("Dinero retirado");
        }
    }

    public void bloquear() {
        bloqueada = true;
    }

    public void desbloquear() {
        bloqueada = false;
    }

    public String getBloqueo() {
        if (bloqueada == true) {
            return "Bloqueada";
        } else {
            return "Desbloqueada";
        }
    }

    public void imprimirDatos() {
        System.out.println("Numero de Cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Estado: " + getBloqueo());
    }
}
