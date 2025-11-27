package objetos.Trafico;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private Coche[] cochePropio = new Coche[10];
    private int contcoches = 0;
    private Coche cocheenuso = null;

    public Persona(String nom, String ape, String d) {
        nombre = nom;
        apellido = ape;
        dni = d;
        cochePropio = new Coche[10];
    }

    public void compraCoche(Coche c) {
        if (contcoches < cochePropio.length) {
            cochePropio[contcoches] = c;
            c.setPropietario(this);
            System.out.println("Coche comprado");
            contcoches++;
        } else {
            System.out.println("No puedes tener mas de 10 coches");
        }
    }

    public void elegirCoche(int coche) {

        if (coche < 0 && coche > contcoches) {
            System.out.println("Indice Invalido");
            return;
        }

        if (cochePropio[coche] != null) {
            cocheenuso = cochePropio[coche];
            System.out.println("Coche " + coche + " elegido");
        } else {
            System.out.println("No tienes ese coche");
        }
    }

    public void usaCoche(double distancia, double velocidad) {
        if (poseeCoche() == true) {
            if (cocheenuso != null) {
                cocheenuso.arrancarMotor();
                cocheenuso.fijarVelocidad(velocidad);
                cocheenuso.recorrerDistancia(distancia);
            } else {
                System.out.println("No tienes ese coche aun");
            }
        } else {
            System.out.println("La persona no posee un coche en propiedad, por lo que no lo puede usar");
        }
    }

    public void repostarCoche(double rep) {
        cocheenuso.repostar(rep);
    }

    public Coche[] getCocheEnPropiedad() {
        return cochePropio;
    }

    public boolean poseeCoche() {
        return contcoches > 0;
    }

    public void imprimirDatosPersonales() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        if (poseeCoche()) {
            System.out.println("Coche en propiedad:");

        } else {
            System.out.println("No posee coche en propiedad.");
        }
    }
}