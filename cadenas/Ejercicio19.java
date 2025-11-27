import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final int DIASSEMANA = 7;
        final int MESANO = 12;
        int opcion;

        do {
        System.out.println("MENU:");
        System.out.println(" 1. Calendario de un mes cualquiera de cualquier año a partir de 1900");
        System.out.println(" 2. Año completo");
        System.out.println(" 3. Fecha determinada según su día de la semana");
        System.out.println(" 4. Salir");
        System.out.print("Opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();
        System.out.println();

            switch (opcion) {
                case 1: {
                    int ano = añoCualquiera();
                    String mes = mesCualquiera();
                    int dias = diasMes(mes, ano);

                    System.out.println("      " + mes.toUpperCase() + " " + ano);
                    System.out.println("------------------------------------");
                    System.out.println(" L  M  X  J  V  S  D");

                    int primerDia = calcularPrimerDia(mes, ano);
                    for (int i = 0; i < primerDia; i++) System.out.print("   ");

                    int contdias = primerDia;
                    for (int i = 1; i <= dias; i++) {
                        System.out.printf("%3d", i);
                        contdias++;
                        if (contdias % DIASSEMANA == 0) System.out.println();
                    }
                    System.out.println("\n");
                    break;
                }
                case 2: {
                    String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                                     "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
                    int ano = añoCualquiera();

                    for (int i = 0; i < MESANO; i++) {
                        int dias = diasMes(mes[i], ano);
                        System.out.println("      " + mes[i].toUpperCase() + " " + ano);
                        System.out.println("------------------------------------");
                        System.out.println(" L  M  X  J  V  S  D");

                        int primerDia = calcularPrimerDia(mes[i], ano);
                        for (int j = 0; j < primerDia; j++) System.out.print("   ");

                        int contdias = primerDia;
                        for (int j = 1; j <= dias; j++) {
                            System.out.printf("%3d", j);
                            contdias++;
                            if (contdias % DIASSEMANA == 0) System.out.println();
                        }
                        System.out.println("\n");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Día: ");
                    int dia = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Mes: ");
                    String mes = sc.nextLine();
                    System.out.print("Año: ");
                    int ano = sc.nextInt();

                    if (fechaValida(dia, mes, ano)) {
                        int diaSemana = (calcularPrimerDia(mes, ano) + dia - 1) % 7;
                        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
                        System.out.println("El " + dia + " de " + mes + " de " + ano + " es " + dias[diaSemana]);
                    } else {
                        System.out.println("Fecha no válida.");
                    }
                    break;
                }
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }   
        } while (opcion != 4);

        sc.close();
    }

    public static int añoCualquiera() {
        int n = (int)(Math.random() * (9999 - 1900 + 1)) + 1900;
        return n;
    }

    public static String mesCualquiera() {
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int n = (int)(Math.random() * 12);
        return mes[n];
    }

    public static int diasMes(String m, int ano) {
        switch (m) {
            case "Enero":
            case "Marzo":
            case "Mayo":
            case "Julio":
            case "Agosto":
            case "Octubre":
            case "Diciembre":
                return 31;
            case "Abril":
            case "Junio":
            case "Septiembre":
            case "Noviembre":
                return 30;
            case "Febrero":
                if (esBisiesto(ano)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public static boolean esBisiesto(int ano) {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    public static int calcularPrimerDia(String mes, int ano) {
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                           "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        int mesIndex = 0;
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equals(mes)) {
                mesIndex = i;
                break;
            }
        }

        int totalDias = 0;

        for (int a = 1900; a < ano; a++) {
            totalDias += esBisiesto(a) ? 366 : 365;
        }

        for (int i = 0; i < mesIndex; i++) {
            totalDias += diasMes(meses[i], ano);
        }

        return totalDias % 7;
    }

    public static boolean fechaValida(int dia, String mes, int ano) {
        return anoCorrecto(ano) && mesCorrecto(mes) && diaCorrecto(dia, mes, ano);
    }

    public static boolean anoCorrecto(int a) {
        return a != 0;
    }

    public static boolean mesCorrecto(String m) {
        switch (m) {
            case "Enero":
            case "Marzo":
            case "Mayo":
            case "Julio":
            case "Agosto":
            case "Octubre":
            case "Diciembre":
            case "Abril":
            case "Junio":
            case "Septiembre":
            case "Noviembre":
            case "Febrero":
                return true;
            default:
                return false;
        }
    }

    public static boolean diaCorrecto(int d, String m, int a) {
        return d >= 1 && d <= diasMes(m, a);
    }
}