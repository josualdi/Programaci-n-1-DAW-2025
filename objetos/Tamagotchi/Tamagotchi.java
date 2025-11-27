package objetos.Tamagotchi;

public class Tamagotchi {
    private String nombre;
    private int cantidadVida;
    private int maxVida;

    public Tamagotchi(String newname, int maxHp) {
        if (maxHp <= 0) {
            System.out.println("Tu tamagotchi no puede tener 0 o menos de vida maxima");
        } else {
            nombre = newname;
            maxVida = maxHp;
            System.out.println("Tamagotchi creado");
        }
    }

    public void visualiza() {
        System.out.println("Datos de tu tamagotchi:");
        System.out.println("  Nombre: " + nombre);
        System.out.println("  Vida: " + cantidadVida);
        System.out.println("  Vida Maxima: " + maxVida);
    }

    public void juega() {
        if (cantidadVida >= 1) {
            cantidadVida--;
            for (int i = 0; i < 5; i++) {
                System.out.println("Estoy jugando");
            }
        } else {
            System.out.println("No tengo vida, no puedo jugar");
        }
    }

    public void come() {
        if (cantidadVida < maxVida) {
            cantidadVida++;
            for (int i = 0; i < 5; i++) {
                System.out.println("Estoy comiendo");
            }
        } else {
            System.out.println("No puedo comer, tengo toda la vida");
        }
    }
}