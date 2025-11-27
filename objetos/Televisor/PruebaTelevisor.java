package objetos.Televisor;

import java.util.Scanner;

public class PruebaTelevisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Televisor tv = new Televisor("Sony", "Trinitron 4", 2003);

        System.out.println("Bienvenido al simulador de Televisor 📺");
        System.out.println("Características iniciales:");
        tv.imprimirCaracteristicas();

        String opcion;

        do {
            System.out.println();
            System.out.println("¿Qué deseas hacer?");
            System.out.println("  - Encender");
            System.out.println("  - Apagar");
            System.out.println("  - Canal actual");
            System.out.println("  - Subir canal");
            System.out.println("  - Bajar canal");
            System.out.println("  - Seleccionar canal");
            System.out.println("  - Cambiar volumen");
            System.out.println("  - Ver características");
            System.out.println("  - Salir");
            System.out.print("Opción: ");
            opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "encender":
                    tv.encender();
                    break;

                case "apagar":
                    tv.apagar();
                    break;

                case "canal actual":
                    tv.obtenerCanal();
                    break;

                case "subir canal":
                    tv.subirCanal();
                    break;

                case "bajar canal":
                    tv.bajarCanal();
                    break;

                case "seleccionar canal":
                    if (!tv.encendida) {
                        System.out.println("No puedes cambiar de canal, el televisor está apagado.");
                    } else {
                        System.out.print("Introduce el canal (0-99): ");
                        int canal = sc.nextInt();
                        sc.nextLine(); 
                        tv.seleccionarCanal(canal);
                    }
                    break;

                case "cambiar volumen":
                    if (!tv.encendida) {
                        System.out.println("No puedes cambiar el volumen, el televisor está apagado.");
                    } else {
                        System.out.print("Introduce el volumen (0-99): ");
                        int vol = sc.nextInt();
                        sc.nextLine();
                        tv.cambiarVolumen(vol);
                    }
                    break;

                case "ver caracteristicas":
                    tv.imprimirCaracteristicas();
                    break;

                case "salir":
                    System.out.println("Gracias por usar el simulador de Televisor.");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }

        } while (!opcion.equalsIgnoreCase("salir"));
    }
}