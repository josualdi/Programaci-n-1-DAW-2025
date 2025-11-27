package objetos.CuentaBanco;

import java.util.Scanner;

public class PruebaCuentaBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBanco a;

        System.out.println("¿Deseas crear una cuenta?");
        System.out.println("  - Si");
        System.out.println("  - No");
        String opcion1 = sc.nextLine().toLowerCase();

        while (!opcion1.equals("si") && !opcion1.equals("no")) {
            System.out.println("Opción no válida. Prueba otra vez.");
            System.out.println("¿Deseas crear una cuenta?");
            System.out.println("  - Si");
            System.out.println("  - No");
            opcion1 = sc.nextLine().toLowerCase();
        }

        switch (opcion1) {
            case "si":
                System.out.print("Tu nombre: ");
                String nom = sc.nextLine();
                System.out.print("Cuanto saldo tienes: ");
                int dinero = sc.nextInt();
                System.out.print("Esta bloqueada la cuenta: ");
                String bloq = sc.nextLine().toLowerCase();
                a = new CuentaBanco((int) (Math.random() * 1000000000) + 1000000000, nom, dinero, bloq);

                System.out.println();
                System.out.println(" Cuenta creada correctamente.");
                System.out.println("Número de cuenta: ES" + a.numeroCuenta());

                String opcion2;
                do {
                    System.out.println();
                    System.out.println("¿Qué deseas hacer?");
                    System.out.println("  - Consulta");
                    System.out.println("  - Saldo");
                    System.out.println("  - Titular");
                    System.out.println("  - Ingresar");
                    System.out.println("  - Retirar");
                    System.out.println("  - Bloquear");
                    System.out.println("  - Desbloquear");
                    System.out.println("  - Salir");
                    System.out.print("Opcion: ");
                    opcion2 = sc.nextLine().toLowerCase();

                    switch (opcion2) {
                        case "consulta":
                            a.imprimirDatos();
                            break;

                        case "saldo":
                            System.out.println("Saldo actual: " + a.consultarSaldo() + " €");
                            break;

                        case "titular":
                            System.out.print("Introduce el nuevo titular: ");
                            String ntit = sc.nextLine();
                            a.cambioTitular(ntit);
                            break;

                        case "ingresar":
                            System.out.print("¿Cuánto dinero deseas ingresar? ");
                            double ing = sc.nextDouble();
                            sc.nextLine();
                            a.ingresarDinero(ing);
                            break;

                        case "retirar":
                            System.out.print("¿Cuánto dinero deseas retirar? ");
                            double ret = sc.nextDouble();
                            sc.nextLine();
                            a.retirarDinero(ret);
                            break;

                        case "bloquear":
                            a.bloquear();
                            break;

                        case "desbloquear":
                            a.desbloquear();
                            break;

                        case "salir":
                            System.out.println("Adiós, gracias por usar el banco.");
                            break;

                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;
                    }
                } while (!opcion2.equalsIgnoreCase("salir"));
                break;

            case "no":
                System.out.println("¿Ya tienes cuenta?");
                System.out.println("  - Si");
                System.out.println("  - No");
                String opcion3 = sc.nextLine().toLowerCase();

                while (!opcion3.equals("si") && !opcion3.equals("no")) {
                    System.out.println("Opción no válida. Prueba otra vez.");
                    System.out.println("¿Ya tienes cuenta?");
                    System.out.println("  - Si");
                    System.out.println("  - No");
                    opcion3 = sc.nextLine().toLowerCase();
                }

                switch (opcion3) {
                    case "si":
                        System.out.println("Introduce tu número de cuenta:");
                        int num = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Lo siento, este programa no guarda cuentas");
                        System.out.println("Tu número " + num + " no se puede comprobar sin base de datos.");
                        break;

                    case "no":
                        System.out.println("Si no tienes cuenta y no quieres crear una, poco puedo hacer");
                        break;
                }
                break;
        }
    }
}