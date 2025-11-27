package objetos.Calculadora;

public class NumeroRacional {
    private int numerador;
    private int denominador;

    public NumeroRacional(int n, int d) {
        numerador = n;
        denominador = d;
    }

    public NumeroRacional suma(NumeroRacional op2) {
        int num = numerador * op2.denominador + op2.numerador * denominador;
        int den = denominador * op2.denominador;
        return new NumeroRacional(num, den);
    }

    public NumeroRacional resta(NumeroRacional op2) {
        int num = numerador * op2.denominador - op2.numerador * denominador;
        int den = denominador * op2.denominador;
        return new NumeroRacional(num, den);
    }

    public NumeroRacional multiplicacion(NumeroRacional op2) {
        int num = numerador * op2.numerador;
        int den = denominador * op2.denominador;
        return new NumeroRacional(num, den);
    }

    public NumeroRacional division(NumeroRacional op2) {
        int num = numerador * op2.denominador;
        int den = denominador * op2.numerador;
        return new NumeroRacional(num, den);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}
