package objetos.Trafico;

public class PrubaCochePersonas {
    public static void main(String[] args) {
        Persona a = new Persona("Diego", "Martinez", "73165233W");
        Coche b = new Coche("584233-JPJ", 40, 4.2, 220);
        Coche c = new Coche("MARTINETE600", 62, 7.2, 400);

        a.usaCoche(20, 120);

        a.compraCoche(b);
        a.compraCoche(c);
        a.elegirCoche(0);
        a.repostarCoche(30);
        a.usaCoche(10, 60);
        a.elegirCoche(1);
        a.repostarCoche(50);
        a.usaCoche(100, 300);
    }
}