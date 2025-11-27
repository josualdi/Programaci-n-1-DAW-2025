package objetos.Fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    private String getMesLetras() {
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "Mes Invalido";
        }
    }

    private boolean esBisiesto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    private int getDiasMes() {
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
                if (esBisiesto() == true) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public boolean esCorrecta() {
        if (ano != 0) {
            if (mes >= 1 && mes <= 12) {
                if (dia >= 1 && dia <= getDiasMes()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        String diastring = Integer.toString(dia);
        String anostring = Integer.toString(ano);

        return diastring + " de " + getMesLetras() + " de " + anostring;
    }
}
