package objetos.Alumno;

public class Alumno {
    private String nombre;
    private float nota;
    private int edad;

    private static float suma = 0;
    private static int cantidad = 0;

    public static float notaMed() {
        return suma / cantidad;
    }

    public Alumno(String nom, float not, int ed) {
        nombre = nom;
        nota = not;
        edad = ed;
        suma += not;
        cantidad++;
    }

    public float getNota() {
        return nota;
    }

    public String getName() {
        return nombre;
    }

    public String toString() {
        String notastr = Float.toString(nota);
        String edadstr = Integer.toString(edad);

        return nombre + " de " + edadstr + " años tiene un " + notastr;
    }
}
