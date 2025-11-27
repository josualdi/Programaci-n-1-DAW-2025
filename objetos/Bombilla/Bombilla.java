package objetos.Bombilla;

public class Bombilla {
    boolean encendida = false;
    int potencia = 100;
    int numEncendidos = 0;
    boolean fundida = false;

    public void encender() {

        if (fundida) {
            return;
        }
        encendida = true;
        numEncendidos++;
        if (numEncendidos == 1000) {
            fundida = true;
        }
    }

    public void apagar() {
        if (fundida) {
            return;
        }
        encendida = false;
    }
}