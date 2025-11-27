package objetos.Bombilla;

public class PruebaBombilla {
    public static void main(String[] args) {
        int i;
        Bombilla b = new Bombilla();

        for (i=0; i < 1000; i++) {
            b.encender();
            b.apagar();
        }
        if (b.fundida) {
            System.out.println("La bombilla se ha fundido después de " + i + " encendidos");
        } else {
            System.out.println("La bombilla no se ha fundido");
        }
        b.encender();
        b.apagar();
    }
}