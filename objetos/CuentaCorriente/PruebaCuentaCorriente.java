package objetos.CuentaCorriente;

import java.util.Scanner;

public class PruebaCuentaCorriente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        double ingreso;
        double retiro;
        CuentaCorriente a = new CuentaCorriente("001");
        CuentaCorriente b = new CuentaCorriente("002");

        do {
            System.out.println("¿Que deseas hacer?");
            System.out.println("  1. Ingresar en la cuenta 001");
            System.out.println("  2. Ingresar en la cuenta 002");
            System.out.println("  3. Retirar de la cuenta 001");
            System.out.println("  4. Retirar de la cuenta 002");
            System.out.println("  5. Visualizar ambas cuentas");
            System.out.println("  6. Fin");

            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Cuanto dinero deseas ingresar: ");
                    ingreso = sc.nextInt();
                    a.ingresaEfectivo(ingreso);
                    break;
                case 2:
                    System.out.print("Cuanto dinero deseas ingresar: ");
                    ingreso = sc.nextDouble();
                    b.ingresaEfectivo(ingreso);
                    break;
                case 3:
                    System.out.print("Cuanto dinero quieres retirar: ");
                    retiro = sc.nextDouble();
                    a.retiraEfectivo(retiro);
                    break;
                case 4:
                    System.out.print("Cuanto dinero quieres retirar: ");
                    retiro = sc.nextDouble();
                    b.retiraEfectivo(retiro);
                    break;
                case 5:
                    System.out.println("Cuenta 001:");
                    a.visualiza();
                    System.out.println();
                    System.out.println("Cuenta 002");
                    b.visualiza();
                    break;
                case 6:
                    System.out.println("Gracias por usar su cuenta. Adios");
                    break;
                default:
                    System.out.println("Valor invalido. Pruebe de nuevo");
            }
        } while (opcion != 6);
    }
}