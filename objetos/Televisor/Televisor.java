package objetos.Televisor;

public class Televisor {
    String marca;
    String modelo;
    int ano; // entre 1950 y 2200
    boolean panoramica = false;
    boolean stereo = false;
    boolean encendida = false;
    int volumen; // entre 0 y 100
    int canal; // entre 0 y 99

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Televisor encendido");
        }
        
    }
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Televisor apagado");
        }
    }
    public void seleccionarCanal(int nuevoCanal) {
        if (nuevoCanal < 0 || nuevoCanal > 99 || !encendida) {
            if (!encendida) {
                System.out.println("El televisor está apagado");
            } else if (nuevoCanal < 0 || nuevoCanal > 99) {
                System.out.println("Canal inválido");
            }
        } else {
            canal = nuevoCanal;
        System.out.println("Canal cambiado al " + canal);
        }
    }
    public void obtenerCanal() {
        if (!encendida) {
            System.out.println("El televisor esta apagado");
        } else {
            System.out.println("Estas en el canal " + canal);
        }
    }
    public void subirCanal() {
        if (!encendida) {
            System.out.println("El televisor está apagado");
        } else if (canal+1 < 100) {
            canal++;
            System.out.println("Has subido de canal al " + canal);
        } else {
            System.out.println("Error, no se puede subir de canal mas de 100");
        }
    }
    public void bajarCanal() {
        if (!encendida) {
            System.out.println("El televisor está apagado");
        } else if (canal-1 > 0) {
            canal--;
            System.out.println("Has bajado de canal al " + canal);
        } else {
            System.out.println("Error, no se puede bajar el canal menos de 0");
        }
    }
    public void cambiarVolumen(int nuevoVolumen) {
        if (nuevoVolumen < 0 || nuevoVolumen > 99 || !encendida) {
            if (!encendida) {
                System.out.println("El televisor está apagado");
            } else if (nuevoVolumen < 0 || nuevoVolumen > 99) {
                System.out.println("Volumen inválido");
            }
        } else {
            volumen = nuevoVolumen;
            System.out.println("Volumen cambiado a " + volumen);
        }
    }
    public void imprimirCaracteristicas() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + ano);
        System.out.println("Panorámica: " + panoramica);
        System.out.println("Estéreo: " + stereo);
        System.out.println("Encendida: " + encendida);
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
    }

    public Televisor (String marcaInicial, String modeloInicial, int anoInicial) {
        if (anoInicial < 1950 || anoInicial > 2200) {
            ano = 2000;
        } else {
            ano = anoInicial;
        }
        marca = marcaInicial;
        modelo = modeloInicial;
    }
}