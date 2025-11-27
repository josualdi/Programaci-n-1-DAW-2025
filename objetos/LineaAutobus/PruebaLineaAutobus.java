package objetos.LineaAutobus;

public class PruebaLineaAutobus {
    public static void main(String[] args) {
        LineaAutobus[] lineas = new LineaAutobus[4];

        for (int i = 0; i < lineas.length; i++) {
            lineas[i] = new LineaAutobus();
            System.out.println(lineas[i]);
            System.out.println();
        }
    }
}