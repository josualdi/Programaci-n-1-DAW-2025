import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        // Scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);

        // Definimos variables para dia, mes y año
        int dia, mes, ano;

        // Pedimos la fecha
        System.out.println("Introduce una fecha (dia, mes, año)");
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();

        // Mientras fechaValida sea false, se pedira la fecha hasta que sea true
        while (!fechaValida(dia, mes, ano)) {
            System.out.println("Fecha inválida. Introduce una fecha válida (dia, mes, año)");
            dia = sc.nextInt();
            mes = sc.nextInt();
            ano = sc.nextInt();
        }
        System.out.println("Fecha válida: " + dia + "/" + mes + "/" + ano);

    }

    // si todo lo de fechaValida se cumple entonces la fecha es valida es decir fechaValida es true
    public static boolean fechaValida(int dia, int mes, int ano) {
        return anoCorrecto(ano) && mesCorrecto(mes) && diaCorrecto(dia, mes, ano);
    }
    
    // Cualquier año menos 0 es correcto, asique cualquier año que no sea 0 hace anoCorrecto true
    public static boolean anoCorrecto(int a) {
        return a != 0;
    }

    // Cualquier mes 1 y 12 devolvera mesCorrecto true, de lo contrario false
    public static boolean mesCorrecto(int m) {
        return m >= 1 && m <= 12;
    }

    // Cualquier dia 1 y el numero de dias del mes es true, de lo contrario false
    public static boolean diaCorrecto(int d, int m, int a) {
        return d >= 1 && d <= diasMes(m, a);
    }

    /**
     * Cualquier mes 1, 3, 5, 7, 8, 10, 12 tiene 31 dias, de lo contrario 30
     * si es 2 y el año es bisiesto entonces 29 dias, de lo contrario 28 dias
     * Cualquier otro devuelve 0
     * Devuelve un int no un boolean
     */
    public static int diasMes(int mes, int ano) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (anoBisiesto(ano)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    // Si el año es divisible por 4 y no es divisible por 100 o es divisible por 400 entonces es true, es bisiesto
    public static boolean anoBisiesto(int a) {
        return a % 4 == 0 && (a % 100 != 0 || a % 400 == 0);
    }
}