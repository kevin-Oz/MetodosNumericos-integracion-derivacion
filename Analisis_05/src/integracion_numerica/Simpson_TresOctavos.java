package integracion_numerica;

import clases.Funcion;

/**
 *
 * @author kevin Figueroa
 */
public class Simpson_TresOctavos {

    private final String f;
    private final double a;
    private final double b;
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Simpson_TresOctavos(String f, double a, double b) {
        this.f = f;
        this.a = a;
        this.b = b;
    }

    public double asche_simple() {
        double h = (b - a) / 3;
        return h;
    }

    public double asche_compuesta() {
        double h = ((b - a) / (3 * n));
        return h;
    }

    public double sumatoria_uno(double h) {
        Funcion fun = new Funcion(f);
        double sum_ = 0;
        for (int k = 1; k <= (n - 1); k++) {
            double temp = (3 * k) * h;
            sum_ = sum_ + fun.eval(a + temp);
        }
        return sum_;
    }

    public double sumatoria_dos(double h) {
        Funcion fun = new Funcion(f);
        double sum_ = 0;
        for (int k = 1; k <= n; k++) {
            double temp = ((3 * k) - 2) * h;
            sum_ = sum_ + fun.eval(a + temp);
        }
        return sum_;
    }

    public double sumatoria_tres(double h) {
        Funcion fun = new Funcion(f);
        double sum_ = 0;
        for (int k = 1; k <= n; k++) {
            double temp = ((3 * k) - 1) * h;
            sum_ = sum_ + fun.eval(a + temp);
        }
        return sum_;
    }

    public double simpson_simple(double h) {
        Funcion fun = new Funcion(f);
        double integral = (3 * h / 8) * (fun.eval(a) + 3 * (fun.eval(a + h)) + 3 * (fun.eval(a + (2 * h))) + fun.eval(b));
        return integral;
    }

    public double simpson_compuesto(double h, double s1, double s2, double s3) {
        Funcion fun = new Funcion(f);
        double integral = ((3 * h / 8) * (fun.eval(a) + fun.eval(b)) + (3 * h / 4) * (s1) + (9 * h / 8) * (s2) + (9 * h / 8) * (s3));
        return integral;
    }

}
