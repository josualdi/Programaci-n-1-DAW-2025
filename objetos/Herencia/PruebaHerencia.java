package objetos.Herencia;

public class PruebaHerencia {
    public static void main(String[] args) {
        CuentaAhorro a = new CuentaAhorro("323232", "Pedro Sanchez Llamas", 2.5);

        a.getCuenta().ingresarDinero(1000);

        a.aplicaInteres();

        a.getCuenta().imprimirDatos();

        a.getCuenta().retirarDinero(2000);

        a.getCuenta().cambiarTitular("Ana Perez Resa");

        a.getCuenta().imprimirDatos();
    }
}
