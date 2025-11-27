package objetos.LineaAutobus;

import java.util.Arrays;

public class LineaAutobus {
    private String numLinea;
    private int frecuencia;
    private int[] paradas;

    public LineaAutobus() {
        numLinea = generarLinea();
        frecuencia = generarFrecuencia();
        paradas = new int[generarCantidadParadas()];
        generarParadas();
    }

    private int generarFrecuencia() {
        return (int) (Math.random() * 20 + 7);
    }

    private String generarLinea() {
        return Integer.toString((int) (Math.random() * 200 + 1));
    }

    private int generarCantidadParadas() {
        return (int) (Math.random() * 20 + 5);
    }

    private void generarParadas() {
        for (int i = 0; i < paradas.length; i++) {
            paradas[i] = (int) (Math.random() * 200 + 8);
        }
    }

    public String getLinea() {
        return numLinea;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public int[] getParadas() {
        return paradas;
    }

    public String toString() {
        return "Linea: " + numLinea + " Frecuencia: " + frecuencia + " minutos\nParadas: " + Arrays.toString(paradas);
    }
}
