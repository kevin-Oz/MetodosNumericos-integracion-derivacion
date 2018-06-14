package integracion_numerica;

import clases.Funcion;

/**
 *
 * @author kevin Figueroa
 */
public class Regla_del_Trapecio {

    private final String f; //funcion a Integrar
    private final double a; // limite inferior de la integral
    private final double b; // limite superior de la integral
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Regla_del_Trapecio(String f, double a, double b) {
        this.f = f;
        this.a = a;
        this.b = b;
    }

    public double asche() {
        double h = (b - a) / n;
        System.out.println("\n" + h);
        return h;
    }

    public double relleno(double h) {
        Funcion fun = new Funcion(f);
        double rellenuto = 0;
        for (int i = 1; i < n; i++) {
            rellenuto = rellenuto + fun.eval(a + i * h);
        }
        System.out.println("\n" + rellenuto);
        return rellenuto;
    }

    public double simple() {
        Funcion fun = new Funcion(f);
        double integral = ((b - a) / 2) * (fun.eval(a) + fun.eval(b));
        return integral;
    }

    public double compuesto(double rellenuto, double h) {
        Funcion fun = new Funcion(f);
        double integral = (h / 2) * (fun.eval(a) + 2 * (rellenuto) + fun.eval(b));

        return integral;
    }

}
